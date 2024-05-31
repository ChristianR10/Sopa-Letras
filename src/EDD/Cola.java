/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import javax.swing.JOptionPane;
import javax.swing.JOptionPane;

/**
 *
 * @author cgrc1
 */
public class Cola {
    private Nodo first;
    private Nodo last;
    private int size;
    
    public Cola (){
        this.first = null;
        this.last = null;
        this.size = 0;
    }
    
    public boolean vacia (){
    return first == null;
    }
    
    public void encolar (String X){
        Nodo nodo = new Nodo (X);
        if (this.vacia()){
            this.first = this.last = nodo;
            this.size ++;
        }
        else{
            last.setNext(nodo);
            last = nodo;
            size ++;
        }
    }
    
    public void desencolar (){
        if(!vacia()){
            first = first.getNext();
            size --;
        }
    }
    
    public void encolarPalabra (String S){
        String [] parts = S.split("");
        for (int i=0; i<S.length();i++){
            encolar(parts[i]);
        }
    }
    
    public void encolarPrimero (String X){
        //Arreglar esta funcion por favor que si no a Guillen le da algo
        if (!vacia()){
            Nodo nodo = new Nodo (X);
            nodo.setNext(first);
            first = nodo;
            size ++;
        }
    }
    
    public void imprimir (){
        String cadena = "";
        while (!vacia()){
            cadena += first.getDato() + ", ";
            desencolar();
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

    public Nodo getLast() {
        return last;
    }

    public void setLast(Nodo last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
}
