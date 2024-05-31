/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import javax.swing.JOptionPane;

/**
 *
 * @author cgrc1
 */
public class Pila {
    private Nodo first;
    private int size;
    
    public Pila (){
        this.first = null;
        this.size = 0;
    }
    
    public boolean vacia (){
    return first == null;
    }
    
    public void apilar (String X){
        Nodo nodo = new Nodo (X);
        if (this.vacia()){
            this.first = nodo;
            this.size ++;
        }
        else{
            nodo.setNext(first);
            first = nodo;
            size ++;
        }
    }
    
    public void desapilar (){
        if(!vacia()){
            first = first.getNext();
            size --;
        }
    }
    
    public void apilarPalabraInv (String S){
        String [] parts = S.split("");
        for (int i=0; i<S.length();i++){
            apilar(parts[S.length()-1-i]);
        }
    }
    
    public boolean encontrado (String X){
        Nodo aux = this.first;
        boolean z = false;
        for (int i = 0; i<size;i++){
            if (aux.getDato().equals(X)){
                z = true;
                break;
            }
            aux = aux.getNext();
        }
        return z;
    }
    
    public void imprimir (){
        String cadena = "";
        while (!vacia()){
            cadena += first.getDato()+"-";
            desapilar();
        }
        JOptionPane.showMessageDialog(null, cadena);
    }
    
    public void imprimirInv (){
        String cadena = "";
        while (!vacia()){
            cadena = "-" + first.getDato() + cadena;
            desapilar();
        }
        JOptionPane.showMessageDialog(null, cadena);
    }
    
    //getter and setter
    public Nodo getFirst() {
        return first;
    }

    public void setFirst(Nodo first) {
        this.first = first;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
      
}
