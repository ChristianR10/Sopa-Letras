package Grafo;

/**
 * Clase Arista
 * Incluye todo lo referente a la construcción de la arista
 * @author Christian Ramos
 * @version 1.0
 */

public class Arista {
    /**
     * @param Destino variable de tipo entero que indica el número del vértice adyacente
     * @param dato variable de tipo char que indica la letra guardada por el vértice adyacente
     * @param Next variable de tiipo arista que apunta a la siguiente arista de la lista
     */
    private int Destino;
    private char dato;
    private Arista Next;

    /**
     * Constructor de la clase arista
     * Hay dos constructores, uno que recibe solo como entrada la variable Destino 
     * y otro que adicionalmente recibe la variable dato
     * en ambos casos, a next se le asigna null
     */
    public Arista(int Destino) {
        this.Destino = Destino;
        this.Next = null;
    }

    public Arista(int Destino, char dato) {
        this.Destino = Destino;
        this.dato = dato;
        this.Next = null;
    }
    
    //getter and setter
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

