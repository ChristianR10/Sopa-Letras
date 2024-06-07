package Grafo;

/**
 * Clase Grafo
 * Incluye todo lo referente a la construcción del grafo
 * @author Christian Ramos
 * @version 1.0
 */

public class Grafo {
    /**
     * @param NumVer variable de tipo Entero que indica la cantidad de vértices que posee el grafo
     * @param first variable de tipo Vertice que apunta al primer vértice del grafo
     * @param last variable de tipo Vertice que apunta al último vértice del grafo
     */
    private int NumVer;
    private Vertice first;
    private Vertice last;

    /**
     *Constructor de la clase Grafo, no recibe parámetro de entrada
     * signa 0 a NumVer y null a first y last
     */
    public Grafo() {
        this.NumVer = 0;
        this.first = null;
        this.last = null;
    }
    
    /**
     * Funcion que indica si el grafo es vacio (no posee vertices)
     * @return true si es vacio, false en caso contrario
     */
    public boolean esVacia () {
    return first == null;
    }
    
    /**
     * Funcion que busca un vértice específico conociendo su número
     * @param n indica el número del vértice
     * @return Vértice n
     */
    public Vertice buscarVertice (int n) {
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
     * Método para asignar una nueva arista a un vértice (unir vertices adyacentes)
     * @param x indica el vertice origen
     * @param y indica el vertice destino
     */
    public void NuevaArista (int x, int y){
        Vertice Origen = buscarVertice (x);
        Vertice Destino = buscarVertice (y);
        Origen.getAdyacencia().agregarArista(Destino);
        
    }
    
    /**
     * Método para agregar un nuevo vértice al grafo
     * @param posicion variable de tipo entero que indica el número del vértice
     * @param Dato variable de tipo char que indica la letra que posee el vértice 
     */
    public void agregarVertice (int posicion, char Dato){
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

    //getter and setter
    public int getNumVer() {
        return NumVer;
    }

    public void setNumVer(int NumVer) {
        this.NumVer = NumVer;
    }

    public Vertice getFirst() {
        return first;
    }

    public void setFirst(Vertice first) {
        this.first = first;
    }

    public Vertice getLast() {
        return last;
    }

    public void setLast(Vertice last) {
        this.last = last;
    }
     
}

