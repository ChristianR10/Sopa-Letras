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
     * @param ListaLetras array que guarda todas las letras de la sopa de letras
     * @param ListaPalabras array que guarda todas las palabras del diccionario
     */
    private String ListaLetras;
    private String ListaPalabras;
    
    public Diccionario(){
    }

    /**
     * funcion que en base a la lectura del txt guarda las letras y plabras
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
        //parts = parts[0].split(",");
        this.ListaLetras = parts[0].toUpperCase(); 
        /*for (int i = 1; i < ListaLetras.length;i++){
            ListaLetras[i] = ListaLetras[i].toUpperCase();
        }*/
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
    
    
    public void agregarPalabra (String palabra){
        if (palabraEnDiccionario(palabra)){
            JOptionPane.showMessageDialog(null, "La palabra ya se encuentra en el diccionario");
        }
        else{
            this.ListaPalabras += palabra.toUpperCase()+"\r\n";
            JOptionPane.showMessageDialog(null, "Palabra agregada al diccionario");
        }
    }
    
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
    
    public String generarTXT (){
        return "dic\r\n" + this.ListaPalabras +"/dic\r\ntab\r\n" + this.ListaLetras + "\r\n/tab";
    }

    //getter and setter
    public String getListaLetras() {
        return ListaLetras;
    }

    public void setListaLetras(String ListaLetras) {
        this.ListaLetras = ListaLetras;
    }

    public String getListaPalabras() {
        return ListaPalabras;
    }

    public void setListaPalabras(String ListaPalabras) {
        this.ListaPalabras = ListaPalabras;
    }

}
