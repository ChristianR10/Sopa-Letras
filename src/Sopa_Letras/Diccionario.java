
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sopa_Letras;

import javax.swing.JOptionPane;

/**
 *
 * @author cgrc1
 */
public class Diccionario {
    private String ListaLetras;
    private String ListaPalabras;
    
    public Diccionario(){
    }

    public void LeerTxT(String cadena){
        this.LeerLetras(cadena);
        this.LeerPalabras(cadena);
    }
    
    
    public void LeerLetras (String cadena){
        String [] parts1 = cadena.split("tab\r\n");
        String [] parts2 = parts1[1].split("/");
        this.ListaLetras = parts2[0].toUpperCase(); 
    }
    
    public void LeerPalabras (String cadena){
        String [] parts1 = cadena.split("dic\r\n");
        String [] parts2 = parts1[1].split("/");
        this.ListaPalabras = parts2[0].toUpperCase();
    }

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
