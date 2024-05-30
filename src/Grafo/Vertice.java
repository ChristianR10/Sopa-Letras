/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

/**
 *
 * @author cgrc1
 */
public class Vertice {
    private char Dato;
    private int Posicion;
    public ListaAdyacencia Adyacencia; //////////////////poner privado
    private Vertice Next;

    public Vertice(int posicion, char Dato) {
        this.Dato = Dato;
        this.Posicion = posicion;
        this.Adyacencia = new ListaAdyacencia();
        this.Next = null;
    }

    public char getDato() {
        return Dato;
    }

    public void setDato(char Dato) {
        this.Dato = Dato;
    }

    public int getPosicion() {
        return Posicion;
    }

    public void setPosicion(int posicion) {
        this.Posicion = posicion;
    }

    public ListaAdyacencia getAdyacencia() {
        return Adyacencia;
    }

    public void setAdyacencia(ListaAdyacencia Adyacencia) {
        this.Adyacencia = Adyacencia;
    }

    public Vertice getNext() {
        return Next;
    }

    public void setNext(Vertice Next) {
        this.Next = Next;
    }

    
}
