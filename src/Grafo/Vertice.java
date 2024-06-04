package Grafo;

/**
 * Clase Vertice
 * Incluye todo lo referente a la construcción de un vertice
 * @author Christian Ramos
 * @version 1.0
 */

public class Vertice {
    private char Dato;
    private int Posicion;
    private ListaAdyacencia Adyacencia; 
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
