package ValidacionesTXT;

import javax.swing.JOptionPane;

/**
 * Clase LecturaTXT
 * Se encarga de leer el txt ingresado y verifica que cumpla con los parámetros necesarios 
 * para que el programa pueda ejecutarse correctamente
 * @author Andrés Rojas y Massimo Restuccia
 * @version 1.0
 */

public class LecturaTXT {
    /**
     * @param LetrasValidas
     */
    char LetrasValidas[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R', 'S'
    , 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    
    /**
     * Constructor de la clase LecturaTXT, no recibe parámetros de entrada ni se le asigna ningún
     * valor a ningún parámetro
     */
    public LecturaTXT() {
    }
   
    /**
     * Maneja todo el proceso de comprobación de la validez de un archivo txt
     * @param txt Variable de tipo string que incluye toda la lectura proveniente del txt
     * @return Devuelve o un string válido de tanto la sopa de letras como todas las palabras, 
     * o un string vacío que representa que la palabra no es válida
     */
    public String comprobacionTXT(String txt){
        txt = txt.toUpperCase();
        int InstanceOfDic = 0;
        int InstanceOfTab = 0;
        String txtFromDic;
        String txtFromTab;
        InstanceOfDic = txt.indexOf("DIC");
        InstanceOfTab = txt.indexOf("TAB");
        
        if(InstanceOfDic == -1 || InstanceOfTab == -1){
            if(InstanceOfDic == -1){
                JOptionPane.showMessageDialog(null, "No se encontró la palabra clave para abrir el diccionario");
            }
            if(InstanceOfTab == -1){
                JOptionPane.showMessageDialog(null, "No se encontró la palabra clave para abrir la sopa de letras");
            }
            return "";
        } else{
            txtFromDic = txt.substring(InstanceOfDic + 3);
            txtFromTab = txt.substring(InstanceOfTab + 3);
            InstanceOfDic = txtFromDic.indexOf("/DIC");
            InstanceOfTab = txtFromTab.indexOf("/TAB");
            if(InstanceOfDic == -1 || InstanceOfTab == -1){
                if(InstanceOfDic == -1){
                    JOptionPane.showMessageDialog(null, "No se encontró la palabra clave para cerrar el diccionario");
            }
                if(InstanceOfTab == -1){
                    JOptionPane.showMessageDialog(null, "No se encontró la palabra clave para cerrar la sopa de letras");
            }
                return "";
            }
        }
        txtFromDic = txtFromDic.substring(0, InstanceOfDic);
        txtFromTab = txtFromTab.substring(0, InstanceOfTab);
        
        String palabras = palabrasCorregidas(txtFromDic);
        String letras = letrasCorregidas (txtFromTab);
        
        if(palabras == "" || letras == ""){
            if(palabras == ""){
                JOptionPane.showMessageDialog(null, "No existen palabras válidas");
            }
            if(letras == ""){}{
                JOptionPane.showMessageDialog(null, "La sopa de letras no es válida");
        }
            return "";
        }
        String TextoArreglado = "dic\r\n" + palabras +"/dic\r\ntab\r\n" + letras + "\r\n/tab";
        return TextoArreglado;
        

    }
    
    /**
     * Recibe un string con todas las palabras, procesa y elimina todas las palabras inválidas
     * @param txt Variable de tipo string que incluye toda la lectura proveniente del txt
     * @return String de todas las palabras válidas para la sopa de letras, mínimo tres letras, mayúscula, sin carácteres especiales
     */
    public String palabrasCorregidas(String txt){
        txt = txt.replaceAll("/r", "");
        txt = txt.replaceAll(" ", "");
        String[] TodasPalabras = txt.split("\n");
        String PalabraCurrent = "";
        String PalabraNueva = "";
        for(int i = 0; i<TodasPalabras.length; i++){
            PalabraCurrent = palabraValida(TodasPalabras[i]);
            if(PalabraCurrent != ""){
                PalabraNueva += PalabraCurrent + "\r\n";
            }
        }
        return PalabraNueva;
    }
    

    /**
     * Recibe un string con todas las letras que conforman la sopa de letras y verifica que todas las letras sean válidas
     * @param txt Variable de tipo string que incluye toda la lectura proveniente del txt
     * @return Devuelve un string con toda las letras válidas para la sopa de letras, si alguna letra no es válida, devuelve un string vacío
     */
    public String letrasCorregidas (String txt){
        String LetrasSinEspacios = txt.replaceAll(" ", "");
        LetrasSinEspacios = LetrasSinEspacios.replaceAll("\n", "");
        LetrasSinEspacios = LetrasSinEspacios.replaceAll("\r", "");
        boolean letraValida;
        letraValida = false;
        if(LetrasSinEspacios.length()!=31){
            JOptionPane.showMessageDialog(null, "Número incorrecto de letras para el tablero");
            return "";
        }
        for(int i = 0; i < LetrasSinEspacios.length(); i++){
            if(i % 2 == 0){
               letraValida = false;
            for(int j = 0; j<this.LetrasValidas.length; j++){
                if(LetrasSinEspacios.charAt(i)==this.LetrasValidas[j]){
                    letraValida = true;
                    break;
                }
            switch(LetrasSinEspacios.charAt(i)){
                case 'Á' -> {
                    LetrasSinEspacios = LetrasSinEspacios.substring(0, i) + 'A' + LetrasSinEspacios.substring(i + 1);
                    letraValida = true;
                    }
                case 'É' -> {
                    LetrasSinEspacios = LetrasSinEspacios.substring(0, i) + 'E' + LetrasSinEspacios.substring(i + 1);
                    letraValida = true;
                    }
                case 'Í' -> {
                    LetrasSinEspacios = LetrasSinEspacios.substring(0, i) + 'I' + LetrasSinEspacios.substring(i + 1);
                    letraValida = true;
                    }
                case 'Ó' -> {
                    LetrasSinEspacios = LetrasSinEspacios.substring(0, i) + 'O' + LetrasSinEspacios.substring(i + 1);
                    letraValida = true;
                    }
                case 'Ú' -> {
                    LetrasSinEspacios = LetrasSinEspacios.substring(0, i) + 'U' + LetrasSinEspacios.substring(i + 1);
                    letraValida = true;
                    }
            } 
            }
            if(letraValida == false){
                return "";
            }
            }
        }
        return LetrasSinEspacios;
    }
    

    /**
     * Crea un string correcto modifico con solo palabras y letras válidas
     * @param TxT Variable de tipo string que incluye toda la lectura proveniente del txt
     * @return Devuelve un string con la sopa de letras y el diccionario arreglado en un solo string
     */
    public String modificarTXT (String TxT){
        String palabras = palabrasCorregidas(TxT);
        String letras = letrasCorregidas (TxT);
        String txt = "dic\r\n" + palabrasCorregidas(palabras) +"\r\n/dic\r\ntab\r\n" + letrasCorregidas (letras) + "\r\n/tab";
        return txt;
    }
    

    /**
     * Función que verifica que una palabra sea válida
     * @param palabra variable de tipo string que indica la palabra que se desee comprobar
     * @return Devuelve un string: si es vacío, la palabra no es válida, si devuelve una palabra de vuelta, es agregada al string
     */
    public String palabraValida (String palabra){
        if(palabra.length() < 3 || palabra.length() > 16){
            return "";
        }
        palabra = palabra.replaceAll("\r", "");
        palabra = palabra.replaceAll("\n", "");
       
        boolean letraValida = false;
        for(int i = 0; i<palabra.length(); i++){
            letraValida = false;
            for(int j = 0; j<this.LetrasValidas.length; j++){
                if(palabra.charAt(i)==this.LetrasValidas[j]){
                    letraValida = true;
                    break;
                }
            switch(palabra.charAt(i)){
                case 'Á' -> {
                    palabra = palabra.substring(0, i) + 'A' + palabra.substring(i + 1);
                    letraValida = true;
                    }
                case 'É' -> {
                    palabra = palabra.substring(0, i) + 'E' + palabra.substring(i + 1);
                    letraValida = true;
                    }
                case 'Í' -> {
                    palabra = palabra.substring(0, i) + 'I' + palabra.substring(i + 1);
                    letraValida = true;
                    }
                case 'Ó' -> {
                    palabra = palabra.substring(0, i) + 'O' + palabra.substring(i + 1);
                    letraValida = true;
                    }
                case 'Ú' -> {
                    palabra = palabra.substring(0, i) + 'U' + palabra.substring(i + 1);
                    letraValida = true;
                    }
            }
            }
            if(letraValida==false){
                return "";
            }
        
        }
        return palabra;
    }
    
}

