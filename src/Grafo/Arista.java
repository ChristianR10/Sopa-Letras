/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

/**
 *
 * @author cgrc1
 */
public class Arista {
    private int Destino;
    private char dato;
    private Arista Next;

    public Arista(int Destino) {
        this.Destino = Destino;
        this.Next = null;
    }

    public Arista(int Destino, char dato) {
        this.Destino = Destino;
        this.dato = dato;
        this.Next = null;
    }
    

    public int getDestino() {
        return Destino;
    }

    public void setDestino(int Destino) {
        this.Destino = Destino;
    }

    public Arista getNext() {
        return Next;
    }

    public void setNext(Arista Next) {
        this.Next = Next;
    }

    public char getDato() {
        return dato;
    }

    public void setDato(char dato) {
        this.dato = dato;
    }
    
    
}
