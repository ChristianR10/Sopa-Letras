package Grafo;

/**
 * Clase Vertice
 * Incluye todo lo referente a la construcción de un vertice
 * @author Christian Ramos
 * @version 1.0
 */

public class Vertice {
    /**
     * @param Dato variable de tipo char que indica la letra que guarda el vértice
     * @param Posicion variable de tipo entero que indica el número del vértice dentro del grafo
     * @param Adyacencia variable de tipo ListaAdyacencia que indica la lista ordenada de aristas del vertice
     * @param Next variable de tipo Vertice que apunta a otro Vertice
     */
    private char Dato;
    private int Posicion;
    private ListaAdyacencia Adyacencia; 
    private Vertice Next;
    
    /**
     * Constructor de la clase Vertice. Asigna de forma aumaticamente los valores de Dato y Posicion segun la entrada, 
     * así como generar una nueva Lista de Adyacencias y asignar null a next
     * @param posicion
     * @param Dato 
     */
    public Vertice(int posicion, char Dato) {
        this.Dato = Dato;
        this.Posicion = posicion;
        this.Adyacencia = new ListaAdyacencia();
        this.Next = null;
    }

    //getter and setter
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
