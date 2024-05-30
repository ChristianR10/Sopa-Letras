/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sopa_Letras;
import EDD.Cola;
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
        Pila P = new Pila ();
        Cola C = new Cola ();
        C.encolarPalabra(palabra);
        Vertice V = G.getFirst();
        for (int i = 1; i < G.getNumVer(); i++){
            if (C.getFirst().getDato().charAt(0) == V.getDato()){
                if (BFS (G,V,C,P)){
                break;}
            V = V.getNext();
            }
        }
        return P;
    }
    
    public boolean BFS (Grafo G, Vertice V, Cola C, Pila P){
        if (C.vacia()){return true;}
        else{
            boolean z = false;
            C.desencolar();
            if (!C.vacia()){
                char elem = C.getFirst().getDato().charAt(0);
                Arista aux = V.Adyacencia.getFirst();
                for (int i = 1; i < V.Adyacencia.getNumAdy(); i++){
                    if (aux.getDato() == elem){
                        if (BFS (G, G.buscarVertice(aux.getDestino()), C, P)){
                            P.apilar(Integer.toString(aux.getDestino()));
                            z = true;
                            break;
                    }
                }  
            }
            }
            else{return true;}
            return z;
        }
    }
    
    public void DFS (){
    }
}
