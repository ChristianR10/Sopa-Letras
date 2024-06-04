package EDD;

import javax.swing.JOptionPane;

/**
 * Clase Cola
 * Incluye lo referente a la Estructura de Datos de tipo Pila, primitivas y principales métodos 
 * Esta clase depende de la clase Nodo
 * @author Christian Ramos
 * @version 1.0
 */

public class Pila {
    /**
     * @param first apunta al nodo ubicado en el tope de la pila
     * @param size indica la cantidad de elementos que posee la pila
     */
    private Nodo first;
    private int size;
    
    /**
     * Constructor de la clase pila, no recibe ninguna entrada
     * asigna automáticamente cero al tamaño de la pila y first apunta a null
     */
    public Pila (){
        this.first = null;
        this.size = 0;
    }
    
    /**
     * Funcion de tipo boolena que indica si la pila esta vacía
     * @return true si la pila es vacía y false si la pila no es vacía
     */
    public boolean vacia (){
    return first == null;
    }
    
    /**
     * Método que apila un nuevo elemento a la lista
     * @param X variable de tipo string que indica el elemento que se desee apilar
     */
    public void apilar (String X){
        Nodo nodo = new Nodo (X);
        if (this.vacia()){
            this.first = nodo;
            this.size ++;
        }
        else{
            nodo.setNext(first);
            first = nodo;
            size ++;
        }
    }
    
    /**
     * Método que desapila el último elemento de la pila
     */
    public void desapilar (){
        if(!vacia()){
            first = first.getNext();
            size --;
        }
    }
    
    /**
     * Método que apila cada letra de una palabra en la pila
     * La primera letra de la palabra queda en el tope
     * @param S variable de tipo string que indica la palabra que se quiera apilar
     */
    public void apilarPalabraInv (String S){
        String [] parts = S.split("");
        for (int i=0; i<S.length();i++){
            apilar(parts[S.length()-1-i]);
        }
    }
    
    /**
     * Función que busca un elemento dentro de la pila
     * @param X variable que indica el elemento que se desea buscar en la pila
     * @return true si el elemento se encuentra en la pila, false de caso contrario
     */
    public boolean encontrado (String X){
        Nodo aux = this.first;
        boolean z = false;
        for (int i = 0; i<size;i++){
            if (aux.getDato().equals(X)){
                z = true;
                break;
            }
            aux = aux.getNext();
        }
        return z;
    }
    
    /**
     * Método que imprime todos los elementos de la pila, empezando por el tope
     * En el proceso, la pila se destruye
     */
    public void imprimir (){
        String cadena = "";
        while (!vacia()){
            cadena += first.getDato()+"-";
            desapilar();
        }
        JOptionPane.showMessageDialog(null, cadena);
    }
    
    /**
     * Método que imprime todos los elementos de la pila, empezando por el fondo
     * En el proceso, la pila se destruye
     */
    public void imprimirInv (){
        String cadena = "";
        while (!vacia()){
            cadena = "-" + first.getDato() + cadena;
            desapilar();
        }
        JOptionPane.showMessageDialog(null, cadena);
    }
    
    //getter and setter
    public Nodo getFirst() {
        return first;
    }

    public void setFirst(Nodo first) {
        this.first = first;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
      
}
