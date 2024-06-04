/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

/**
 *
 * @author cgrc1
 */
public class Grafo {
    private int NumVer;
    private Vertice first;
    private Vertice last;

    /**
     *
     */
    public Grafo() {
        this.NumVer = 0;
        this.first = null;
        this.last = null;
    }
    
    /**
     *
     * @return
     */
    public boolean esVacia () {
    return first == null;
    }
    
    /**
     *
     * @param n
     * @return
     */
    public Vertice buscarVertice (int n /*n: numero del vertice*/) {
        //Busca elemento de la lista
        Vertice aux = first;
        if (!esVacia()){
            for (int i = 0; i<NumVer; i++){
                if (aux.getPosicion()== n) {break;}
                else {aux = aux.getNext();}
            }
        }
        return aux;
    }
    
    /**
     *
     * @param x
     * @param y
     */
    public void NuevaArista (int x, int y){
        Vertice Origen = buscarVertice (x);
        Vertice Destino = buscarVertice (y);
        Origen.getAdyacencia().agregarArista(Destino);
        
    }
    
    /**
     *
     * @param posicion
     * @param Dato
     */
    public void agregarVertice (int posicion, char Dato){
        // Agregar nuevo Vertice
        Vertice vertice = new Vertice(posicion, Dato);
        if (esVacia()){
            first = last = vertice;
            NumVer++;
        }
        else {
            if (buscarVertice(posicion)==null){
            last.setNext(vertice);
            last = vertice;
            NumVer ++;}  
        }
    }

    /**
     *
     * @return
     */
    public int getNumVer() {
        return NumVer;
    }

    /**
     *
     * @param NumVer
     */
    public void setNumVer(int NumVer) {
        this.NumVer = NumVer;
    }

    /**
     *
     * @return
     */
    public Vertice getFirst() {
        return first;
    }

    /**
     *
     * @param first
     */
    public void setFirst(Vertice first) {
        this.first = first;
    }

    /**
     *
     * @return
     */
    public Vertice getLast() {
        return last;
    }

    /**
     *
     * @param last
     */
    public void setLast(Vertice last) {
        this.last = last;
    }
    
    
}
