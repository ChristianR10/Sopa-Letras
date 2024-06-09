package Sopa_Letras;

import javax.swing.JOptionPane;

/**
 * Clase diccionario
 * Almacena toda la informacion proveniente del archivo txt (palabras y letras)
 * @author Christian Ramos
 * @version 1.0
 */
public class Diccionario {
    /**
     * @param ListaLetras string que guarda todas las letras de la sopa de letras
     * @param ListaPalabras string que guarda todas las palabras del diccionario
     */
    private String ListaLetras;
    private String ListaPalabras;
    
    /**
     * Constructor de la clase diccionario
     * No recibe parámetro de entrada ni asigna ningun valor
     */
    public Diccionario(){
    }

    /**
     * funcion que en base a la lectura del txt guarda las letras y plabras en los respectivos parámetros internos
     * @param cadena variable de tipo string que contiene toda la informacion del txt
     */
    public void LeerTxT(String cadena){
        this.LeerLetras(cadena);
        this.LeerPalabras(cadena);
    }
    
    /**
     * funcion que filtra la seccion de letras del txt y las almacena como parametro interno
     * @param cadena variable de tipo string que contiene toda la informacion del txt
     */
    public void LeerLetras (String cadena){
        String [] parts = cadena.split("tab\r\n");
        parts = parts[1].split("\r\n/");
        this.ListaLetras = parts[0].toUpperCase(); 
    }
    
    /**
     * funcion que filtra la seccion de palabras del txt y las almacena como parametro interno
     * @param cadena variable de tipo string que contiene toda la informacion del txt
     */
    public void LeerPalabras (String cadena){
        String [] parts = cadena.split("dic\r\n");
        parts = parts[1].split("/");
        this.ListaPalabras = parts[0].toUpperCase();
    }
    
    /**
     * metodo que permite guardar una nueva palabra al diccionario. 
     * En caso de ya encontrarse en el diccionario, se lo notifica al usuario
     * @param palabra variable de tipo string que indica la nueva palabra que se desee agregar
     */
    public void agregarPalabra (String palabra){
        if (palabraEnDiccionario(palabra)){
            JOptionPane.showMessageDialog(null, "La palabra ya se encuentra en el diccionario");
        }
        else{
            this.ListaPalabras += palabra.toUpperCase()+"\r\n";
            JOptionPane.showMessageDialog(null, "Palabra agregada al diccionario");
        }
    }
    
    /**
     * funcion de tipo boolean que indica si una palabra ya se encuentra en el diccionario
     * @param palabra variable de tipo string que indica la palabra que se desee buscar
     * @return true si la palabra se encuentra en el diccionario, false en caso contrario
     */
    public boolean palabraEnDiccionario (String palabra){
        palabra = palabra.toUpperCase();
        boolean encontrado = false;
        String [] todasPalabras = ListaPalabras.split("\r\n");
        for (int i = 0; i < todasPalabras.length; i++) {
            if(palabra.equals(todasPalabras[i].toUpperCase())){
                encontrado = true;
                break;
            }
        }
        return encontrado;
    }
    
    /**
     * metodo que genera un nuevo string para crear un txt en base a la informacion interna del diccionario
     * @return string en el formato solicitado para el txt
     */
    public String generarTXT (){
        return "dic\r\n" + this.ListaPalabras +"/dic\r\ntab\r\n" + this.ListaLetras + "\r\n/tab";
    }


    /**
     * @return variable interna ListaLetras
     */
    public String getListaLetras() {
        return ListaLetras;
    }

    /**
     * modifica la variable interna ListaLetras 
     * @param ListaLetras nueva variable de tipo string
     */
    public void setListaLetras(String ListaLetras) {
        this.ListaLetras = ListaLetras;
    }

    /**
     * @return variable interna ListaPalabras
     */
    public String getListaPalabras() {
        return ListaPalabras;
    }

    /**
     * modifica la variable interna ListaPalabras
     * @param ListaPalabras nueva variable de tipo string
     */
    public void setListaPalabras(String ListaPalabras) {
        this.ListaPalabras = ListaPalabras;
    }

}
