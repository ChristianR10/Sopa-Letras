package EDD;

import javax.swing.JOptionPane;

/**
 * Clase Cola
 * Incluye lo referente a la Estructura de Datos de tipo Cola, primitivas y principales métodos 
 * Esta clase depende de la clase Nodo
 * @author Christian Ramos
 * @version 1.0
 */

public class Cola {
    /**
    * @param first variable privada de tipo Nodo que apunta al primer elemento insertado en la cola
    * @param last variable privada de tipo Nodo que apunta al último elemento insertado en la cola
    * @param size variable privada de tipo entero que indica la cantidad de elementos que posee la cola
    */
    
    private Nodo first;
    private Nodo last;
    private int size;
    
    /**
     * Constructor de la clase Cola, no recibe parámetro de entrada
     * automáticamente asigna valores de null a first y last, y 0 a size
     */
    
    public Cola (){
        this.first = null;
        this.last = null;
        this.size = 0;
    }
    
    /**
     * @return true si la cola es vacía y false si la lista no es vacía
     */
    public boolean vacia (){
    return first == null;
    }
    
    /**
     * encola en la lista la viable de entrada
     * @param X variable de tipo String que se desea encolar
     */
    public void encolar (String X){
        Nodo nodo = new Nodo (X);
        if (this.vacia()){
            this.first = this.last = nodo;
            this.size ++;
        }
        else{
            last.setNext(nodo);
            last = nodo;
            size ++;
        }
    }
    
    /**
     * desencola el primer elemento de la cola
     */
    public void desencolar (){
        if(!vacia()){
            first = first.getNext();
            size --;
        }
    }
    
    /**
     * Recibe como entrada una palabra entera y encola (en orden) cada una de sus letras
     * @param S palabra en formato string que se quiere encolar
     */
    public void encolarPalabra (String S){
        String [] parts = S.split("");
        for (int i=0; i<S.length();i++){
            encolar(parts[i]);
        }
    }
    
    /**
     * imprime en todos los elementos que se encuentren en la cola, en el proceso se destruye la cola
     */
    public void imprimir (){
        String cadena = "";
        while (!vacia()){
            cadena += first.getDato() + ", ";
            desencolar();
        }
        JOptionPane.showMessageDialog(null, cadena);
    }
    
    
    /**
     * @return primer nodo de la cola
     */
    public Nodo getFirst() {
        return first;
    }
    
    /**
     * Modifica el primer nodo de la cola
     * @param first 
     */
    public void setFirst(Nodo first) {
        this.first = first;
    }
    
    /**
     * @return último nodo de la cola
     */
    public Nodo getLast() {
        return last;
    }
    
    /**
     * modifica el último nodo de la cola
     * @param last 
     */
    public void setLast(Nodo last) {
        this.last = last;
    }
    
    /**
     * @return la cantidad de elementos que posee la cola
     */
    public int getSize() {
        return size;
    }

    /**
     * modifica la cantidad de elementos que posee la cola
     * @param size 
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    
}

