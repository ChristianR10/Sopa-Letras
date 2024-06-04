package Sopa_Letras;
import EDD.Pila;
import Grafo.Arista;
import Grafo.Grafo;
import Grafo.Vertice;

/**
 * Clase Busqueda
 * Incluye lo referente a las dos metodologías de búsqueda de palabras en el grafo (BFS y DFS)
 * Esta clase depende de las clases Sopa_Letras, Pila, Arista, Grafo y Vertice
 * @author Christian Ramos y Andrés Rojas
 * @version 1.0
 */

public class Busqueda {
    
    /**
     * Constructor de la clase Búsqueda, no recibe parámetros de entrada ni se le asigna ningún
     * valor a ningún parámetro
     */
    public Busqueda() {
    }
    
    /**
     * Primera parte de la función buscarBFS. Esta función recibe como parámetro la palabra que se
     * desee buscar en el grafo, y realiza una búsqueda utilizando la metodología de búsqueda en anchura
     * @param G variable de tipo grafo que indica el grafo en el que se va arealizar la búsqueda
     * @param palabra variable de tipo String que indica la palabra que se desea buscar
     * @return retorna una pila ordenada con el número de los vértices donde se encuentran las distintas 
     * letras de la palabra. En caso de no encontrar la palabra, la pila será vacía
     */
    public Pila buscarBFS (Grafo G, String palabra){
        Pila pilaLetras = new Pila ();
        Pila pilaVisitados = new Pila ();
        pilaLetras.apilarPalabraInv(palabra);
        Vertice V = G.getFirst();
        for (int i = 0; i < G.getNumVer(); i++){
            if (pilaLetras.getFirst().getDato().charAt(0) == V.getDato()){
                pilaVisitados.apilar(Integer.toString(V.getPosicion()));
                if (BFS (G,V,pilaLetras,pilaVisitados)){
                    break;
                }
                else {pilaVisitados.desapilar();}
            }
            V = V.getNext();
        }
        return pilaVisitados;
    }
    
    /**
     * Segunda parte de función buscarBFS. Esta función recursiva se encarga de revisar si la siguiente letra de la
     * palabra se encuentra en un vértice adyacente al actual.
     * @param G variable de tipo grafo que indica el grafo donde se realizará la búsqueda
     * @param V indica el vértice donde se esta posicionado actualmente
     * @param pilaLetras variable de tipo pila que incluye todas las letras restantes por buscar
     * @param pilaVisitados variable de tipo pila que incluye todos los vértices donde ya se han encontrado letras de la palabra
     * @return true si la letra que se esta buscando se encuentra en un vértice adyacente al actual, false en caso contrario
     */
    public boolean BFS (Grafo G, Vertice V, Pila pilaLetras, Pila pilaVisitados){
        if (pilaLetras.vacia()){return true;}
        else{
            boolean z = false;
            pilaLetras.desapilar();
            if (!pilaLetras.vacia()){
                char elem = pilaLetras.getFirst().getDato().charAt(0);
                Arista aux = V.getAdyacencia().getFirst();
                for (int i = 0; i < V.getAdyacencia().getNumAdy(); i++){
                    if (aux.getDato() == elem && !pilaVisitados.encontrado(Integer.toString(aux.getDestino()))){
                        pilaVisitados.apilar(Integer.toString(aux.getDestino()));
                        if (BFS (G, G.buscarVertice(aux.getDestino()), pilaLetras, pilaVisitados)){
                            z = true;
                            break;
                        }
                        else {pilaVisitados.desapilar();}
                    }
                    aux = aux.getNext();
                }
                if (!z){pilaLetras.apilar(Character.toString(V.getDato()));}
            }
            else{return true;}
            return z;
        }
    }
    
    public void DFS (){
    }
}
