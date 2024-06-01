/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

/**
 *
 * @author cgrc1
 */
public class ListaAdyacencia {
    private int NumAdy;
    private Arista first;
    private Arista last;

    public ListaAdyacencia() {
        this.first = null;
        this.last = null;
        this.NumAdy = 0;
    }
    
    public boolean esVacia (){
        // indica que la lista es vacia
        return first == null;
    }
    
    public Arista buscarArista (int n) {
        //Busca elemento de la lista
        Arista aux = first;
        if (!esVacia()){
            for (int i = 0; i<NumAdy; i++){
                if (aux.getDestino()== n) {break;}
                else {aux = aux.getNext();}
            }
        }
        return aux;
    }
    
    public boolean adyacente (int destino){
        // Indica si el vertice actual ya tiene adyacencia con el vertice destino
        Arista aux = buscarArista(destino);
        return aux != null;
    }
    
    public void agregarArista (Vertice n){
        // Agregar nueva Arista
        Arista arista = new Arista(n.getPosicion(), n.getDato());
        if (esVacia()){
            first = last = arista;
            NumAdy++;
        }
        else {
            if (!adyacente(n.getPosicion())){
            last.setNext(arista);
            last = arista;
            NumAdy ++;}  
        }
    }

    public int getNumAdy() {
        return NumAdy;
    }

    public void setNumAdy(int NumAdy) {
        this.NumAdy = NumAdy;
    }

    public Arista getFirst() {
        return first;
    }

    public void setFirst(Arista first) {
        this.first = first;
    }

    public Arista getLast() {
        return last;
    }

    public void setLast(Arista last) {
        this.last = last;
    }
    
    
}

