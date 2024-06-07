
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
    private String [] ListaLetras;
    private String [] ListaPalabras;
    
    public Diccionario(){
    }

    public void LeerTxT(String cadena){
        this.LeerLetras(cadena);
        this.LeerPalabras(cadena);
    }
    
    
    public void LeerLetras (String cadena){
        String [] parts = cadena.split("tab\r\n");
        parts = parts[1].split("\r\n/");
        parts = parts[0].split(",");
        this.ListaLetras = parts; 
        for (int i = 1; i < ListaLetras.length;i++){
            ListaLetras[i] = ListaLetras[i].toUpperCase();
        }
    }
    
    public void LeerPalabras (String cadena){
        String [] parts = cadena.split("dic\r\n");
        parts = parts[1].split("/");
        parts = parts[0].split("\r\n");
        this.ListaPalabras = parts;
        for (int i = 1; i < ListaPalabras.length;i++){
            ListaPalabras[i] = ListaPalabras[i].toUpperCase();
        }
    }

    public String[] getListaLetras() {
        return ListaLetras;
    }

    public void setListaLetras(String[] ListaLetras) {
        this.ListaLetras = ListaLetras;
    }

    public String[] getListaPalabras() {
        return ListaPalabras;
    }

    public void setListaPalabras(String[] ListaPalabras) {
        this.ListaPalabras = ListaPalabras;
    }

   
}
