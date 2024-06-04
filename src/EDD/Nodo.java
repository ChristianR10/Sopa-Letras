package EDD;

/**
 * Clase Nodo
 * Incluye lo referente a la construcción de nodos 
 * @author Christian Ramos
 * @version 1.0
 */

public class Nodo {
    /**
     * @param dato variable de tipo string que guarda la información del nodo
     * @param next variable de tipo Nodo que apunta a otro nodo
     */
    private String dato;
    private Nodo next;

    /**
     * Constructor de la clase Nodo, asigna automáticamente la variable dato según la entrada y a next le asigna null
     * @param dato variable string que indica la información se desea que guarde el nodo
     */
    public Nodo(String dato) {
        this.dato = dato;
        this.next = null;
    }

    //getter and setter
    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    
}
