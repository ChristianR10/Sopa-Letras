/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sopa_Letras;
import Grafo.Grafo;
import Grafo.Vertice;
import Grafo.Arista;
import Grafo.ListaAdyacencia;
import EDD.Pila;
/**
 *
 * @author Andrés
 */
public class Busqueda_DFS {
    private Pila Palabra;
    private Grafo SopaDeLetras;
    private Pila PalabraEncontrada;
    private Pila CopiaInvertida;
    private Boolean WordFound;
    public Busqueda_DFS(){
        this.PalabraEncontrada = new Pila();
        this.Palabra = new Pila();
        this.CopiaInvertida = new Pila();
        this.WordFound = false;
    }
    public Pila BuscarDFS(Grafo G, String Palabra){
        //Inicializo
        this.SopaDeLetras = G;
        Vertice Iter = this.SopaDeLetras.getFirst();
        this.Palabra.apilarPalabraInv(Palabra);
        while(Iter != null){
            if(Iter.getDato() == this.Palabra.getFirst().getDato().charAt(0)){
                this.PalabraEncontrada.apilar(Integer.toString(Iter.getPosicion()));
                DFS(Iter);
                if(WordFound){break;}
            }
            Iter = Iter.getNext();
        }
        return this.PalabraEncontrada;
    }
    
    private void DFS(Vertice Root){
        if(this.PalabraEncontrada.getSize()<this.Palabra.getSize()){
            ListaAdyacencia Posibles = Root.getAdyacencia();
            Arista NextStep = Posibles.getFirst();
            while(NextStep != null){
                if(this.PalabraEncontrada.encontrado(Integer.toString(NextStep.getDestino()))==false){
                    this.PalabraEncontrada.apilar(Integer.toString(NextStep.getDestino()));
                    DFS(this.SopaDeLetras.buscarVertice(NextStep.getDestino()));
                    if(this.WordFound == true){
                        return;
                    }else{
                        this.PalabraEncontrada.desapilar();
                    }
                }
                NextStep = NextStep.getNext();
            }
        } else{
            CrearCopia();
            WordFound = CheckWord();
        }
    }
    
    private Boolean CheckWord(){
        if(this.CopiaInvertida.vacia() == true || this.Palabra.vacia() == true){
            return true;
        }
        int position = Integer.parseInt(this.CopiaInvertida.getFirst().getDato());
        char elem1 = this.SopaDeLetras.buscarVertice(position).getDato();
        char elem2 = this.Palabra.getFirst().getDato().charAt(0);
        this.CopiaInvertida.desapilar();
        this.Palabra.desapilar();
        if(CheckWord() == true){
            this.Palabra.apilar(Character.toString(elem2));
            return elem1 == elem2;
        }else{
            this.Palabra.apilar(Character.toString(elem2));
            return false;
        }
    }
        
    private void Invertir(){
        if(!this.PalabraEncontrada.vacia()){
            String elem = this.PalabraEncontrada.getFirst().getDato();
            this.PalabraEncontrada.desapilar();
            this.CopiaInvertida.apilar(elem);
            Invertir();
            this.PalabraEncontrada.apilar(elem);
        }
    }
        
    private void CrearCopia(){
        this.CopiaInvertida.VaciarPila();
        Invertir();
    }
}
