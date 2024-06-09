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
     * @param posicion variable de tipo entero que indica el número del vértice dentro del grafo
     * @param Dato variable de tipo char que indica la letra que guarda el vértice
     */
    public Vertice(int posicion, char Dato) {
        this.Dato = Dato;
        this.Posicion = posicion;
        this.Adyacencia = new ListaAdyacencia();
        this.Next = null;
    }

    /**
     * @return variable interna dato
     */
    public char getDato() {
        return Dato;
    }

    /**
     * modifica la variable interna dato
     * @param Dato nueva variable de tipo char
     */
    public void setDato(char Dato) {
        this.Dato = Dato;
    }

    /**
     * @return variable interna posicion
     */
    public int getPosicion() {
        return Posicion;
    }

    /**
     * modifica la variable interna posicion
     * @param posicion nueva variable de tipo entero
     */
    public void setPosicion(int posicion) {
        this.Posicion = posicion;
    }

    /**
     * @return variable interna adyacencia
     */
    public ListaAdyacencia getAdyacencia() {
        return Adyacencia;
    }

    /**
     * modifica la variable interna adyacencia
     * @param Adyacencia nueva variable de tipo ListaAdyacencia
     */
    public void setAdyacencia(ListaAdyacencia Adyacencia) {
        this.Adyacencia = Adyacencia;
    }

    /**
     * @return variable interna next
     */
    public Vertice getNext() {
        return Next;
    }

    /**
     * modifica la variable interna next
     * @param Next nueva variable de tipo vertice
     */
    public void setNext(Vertice Next) {
        this.Next = Next;
    } 
}