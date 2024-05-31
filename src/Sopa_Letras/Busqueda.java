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
import javax.swing.JOptionPane;

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
        //C.imprimir();
        Vertice V = G.getFirst();
        //JOptionPane.showMessageDialog(null, V.getDato());
        for (int i = 0; i < G.getNumVer(); i++){
            if (C.getFirst().getDato().charAt(0) == V.getDato()){
                if (BFS (G,V,C,P)){
                    P.apilar(Integer.toString(V.getPosicion()));
                    break;
                }
            }
            V = V.getNext();
        }
        return P;
    }
    
    public boolean BFS (Grafo G, Vertice V, Cola C, Pila P){
        if (C.vacia()){return true;}
        else{
            Vertice vaux = V;
            boolean z = false;
            C.desencolar();
            if (!C.vacia()){
                char elem = C.getFirst().getDato().charAt(0);
                Arista aux = vaux.Adyacencia.getFirst();
                for (int i = 0; i < vaux.Adyacencia.getNumAdy(); i++){
                    if (aux.getDato() == elem){
                        if (BFS (G, G.buscarVertice(aux.getDestino()), C, P)){
                            P.apilar(Integer.toString(aux.getDestino()));
                            z = true;
                            break;
                        }
                    }
                    aux = aux.getNext();
                }
                if (!z){C.encolarPrimero(Character.toString(V.getDato()));}
            }
            else{return true;}
            return z;
        }
    }
    
    public void DFS (){
    }
}
