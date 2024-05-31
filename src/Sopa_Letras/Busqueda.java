/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sopa_Letras;
import EDD.Pila;
import Grafo.Arista;
import Grafo.Grafo;
import Grafo.Vertice;

/**
 *
 * @author cgrc1
 */
public class Busqueda {

    public Busqueda() {
    }
    
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
