package Grafo;

/**
 * Clase ListaAdyacencia
 * Incluye todo lo relacionado a la lista ordenada de aristas que posee un vertice
 * @author Christian Ramos
 * @version 1.0
 */

public class ListaAdyacencia {
    
    /**
     * @param NumAdy variable de tipo entero que indica la cantidad de aristas que posee un vertice
     * @param first variable de tipo Arista que apunta a la primera arista de la lista
     * @param last variable de tipo Arista que apunta a la ultima arista de la lista
     */
    private int NumAdy;
    private Arista first;
    private Arista last;

    /**
     * constructor de la clase ListaAdyacencia
     * automaticamente asigna 0 a NumAdy y apunta a first y last a null
     */
    public ListaAdyacencia() {
        this.first = null;
        this.last = null;
        this.NumAdy = 0;
    }
    
    /**
     * Funcion que indica si la lista es vacía
     * @return true si la lista en vacia, falso en caso contrario
     */
    public boolean esVacia (){
        return first == null;
    }
    
    /**
     * Funcion que busca una arista en específico dentro de la lista
     * @param n indica el numero del vertice destino asignado a la arista que se este buscando
     * @return variable arista buscada
     */
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
    
    /**
     * Funcion que indica si el vertice actual ya tiene adyacencia con el vertice destino
     * @param destino variable de tipo entero que indica el vertice que se este buscando unir con el actual
     * @return true si los vertices ya estan unidos, false en caso contrario
     */
    public boolean adyacente (int destino){
        Arista aux = buscarArista(destino);
        return aux != null;
    }
    
    /**
     * Método para agregar una nueva arista a la lista
     * @param n indica el número de vértice del destino
     */
    public void agregarArista (Vertice n){
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

    /**
     * @return variable interna NumAdy
     */
    public int getNumAdy() {
        return NumAdy;
    }

    /**
     * modifica la variable interna NumAdy
     * @param NumAdy nueva variable de tipo entero
     */
    public void setNumAdy(int NumAdy) {
        this.NumAdy = NumAdy;
    }

    /**
     * @return variable interna first
     */
    public Arista getFirst() {
        return first;
    }

    /**
     * modifica la variable interna arista
     * @param first nueva variable de tipo arista
     */
    public void setFirst(Arista first) {
        this.first = first;
    }

    /**
     * @return variable interna last
     */
    public Arista getLast() {
        return last;
    }

    /**
     * modifica la variable interna last
     * @param last nueva variable de tipo arista
     */
    public void setLast(Arista last) {
        this.last = last;
    }
    
    
}


