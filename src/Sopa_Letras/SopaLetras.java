<<<<<<< Updated upstream
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sopa_Letras;

import Grafo.Arista;
import Grafo.Grafo;
import Grafo.Vertice;


/**
 *
 * @author cgrc1
 */
public class SopaLetras {
        char [][] LetraSopa; //Matriz usando las letras
        int [][] PosicioneSopa; //Matriz usando el numero de vertice
        int numCol; //Nro. Columnas de la matriz
        int numFilas; //Nro. Filas de la matriz
        Grafo grafo;

    public SopaLetras(int x, int y) {
        //Indica tamano de la sopa de letras (lo hice general, en el proyecto usaremos 4x4)
        this.LetraSopa = new char [x][y];
        this.PosicioneSopa = new int [x][y];
        this.numCol = y;
        this.numFilas = x;
        this.grafo = new Grafo();
    }
            
    public void armarSopa (String cadena){
        String [] parts = cadena.split(", ");
        crearVertices(parts, grafo);
        crearAristas (grafo);
    }
    
    public void crearVertices (String [] parts, Grafo grafo){
        //Crear Vertices (Prueba)
        int z = 0;
        for (int i=0;i<numFilas;i++){
            for (int j=0;j<numCol;j++){
                LetraSopa [i][j] = parts[z].charAt(0); 
                PosicioneSopa [i][j] = 4*(i)+(j);
                grafo.agregarVertice(j+i*4, LetraSopa [i][j]);
                z++;
            }
        }
    }
    
    public void crearAristas (Grafo grafo){
        //Crear Aristas (Prueba)
        for (int i = 0; i <numFilas; i++){
            for (int j = 0; j< numCol; j++){
                try{grafo.NuevaArista(PosicioneSopa[i][j], PosicioneSopa[i-1][j-1]);}
                catch (Exception e){}
                try{grafo.NuevaArista(PosicioneSopa[i][j], PosicioneSopa[i-1][j]);}
                catch (Exception e){}
                try{grafo.NuevaArista(PosicioneSopa[i][j], PosicioneSopa[i-1][j+1]);}
                catch (Exception e){}
                try{grafo.NuevaArista(PosicioneSopa[i][j], PosicioneSopa[i][j-1]);}
                catch (Exception e){}
                try{grafo.NuevaArista(PosicioneSopa[i][j], PosicioneSopa[i][j+1]);}
                catch (Exception e){}
                try{grafo.NuevaArista(PosicioneSopa[i][j], PosicioneSopa[i+1][j-1]);}
                catch (Exception e){}
                try{grafo.NuevaArista(PosicioneSopa[i][j], PosicioneSopa[i+1][j]);}
                catch (Exception e){}
                try{grafo.NuevaArista(PosicioneSopa[i][j], PosicioneSopa[i+1][j+1]);}
                catch (Exception e){}
            }
        }
    }
    
    public String imprimirAdyacentes (int v){
        //imprime Vertices Adyacentes de uno Solicitado
        String cadena = "";
        Vertice vertice = grafo.buscarVertice(v);
        Arista arista = vertice.Adyacencia.getFirst();
        for (int i = 1; i < vertice.Adyacencia.getNumAdy();i++){
            cadena += Integer.toString(arista.getDestino())+", ";
            arista = arista.getNext();
        }
        cadena += Integer.toString(arista.getDestino());
        return cadena;
    }
            
        
        
}

=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sopa_Letras;

import EDD.Pila;
import EDD.Cola;
import Grafo.Arista;
import Grafo.Grafo;
import Grafo.Vertice;

/**
 *
 * @author cgrc1
 */
public class SopaLetras {
        char [][] LetraSopa; //Matriz usando las letras
        int [][] PosicioneSopa; //Matriz usando el numero de vertice
        int numCol; //Nro. Columnas de la matriz
        int numFilas; //Nro. Filas de la matriz
        Grafo grafo;

    public SopaLetras(int x, int y) {
        //Indica tamano de la sopa de letras (lo hice general, en el proyecto usaremos 4x4)
        this.LetraSopa = new char [x][y];
        this.PosicioneSopa = new int [x][y];
        this.numCol = y;
        this.numFilas = x;
        this.grafo = new Grafo();
    }
            
    public void armarSopa (String cadena){
        cadena = cadena.toUpperCase();
        String [] parts = cadena.split(", ");
        crearVertices(parts, grafo);
        crearAristas (grafo);
    }
    
    public void crearVertices (String [] parts, Grafo grafo){
        //Crear Vertices (Prueba)
        int z = 0;
        for (int i=0;i<numFilas;i++){
            for (int j=0;j<numCol;j++){
                LetraSopa [i][j] = parts[z].charAt(0); 
                PosicioneSopa [i][j] = 4*(i)+(j);
                grafo.agregarVertice(j+i*4, LetraSopa [i][j]);
                z++;
            }
        }
    }
    
    public void crearAristas (Grafo grafo){
        //Crear Aristas (Prueba)
        for (int i = 0; i <numFilas; i++){
            for (int j = 0; j< numCol; j++){
                try{grafo.NuevaArista(PosicioneSopa[i][j], PosicioneSopa[i-1][j-1]);}
                catch (Exception e){}
                try{grafo.NuevaArista(PosicioneSopa[i][j], PosicioneSopa[i-1][j]);}
                catch (Exception e){}
                try{grafo.NuevaArista(PosicioneSopa[i][j], PosicioneSopa[i-1][j+1]);}
                catch (Exception e){}
                try{grafo.NuevaArista(PosicioneSopa[i][j], PosicioneSopa[i][j-1]);}
                catch (Exception e){}
                try{grafo.NuevaArista(PosicioneSopa[i][j], PosicioneSopa[i][j+1]);}
                catch (Exception e){}
                try{grafo.NuevaArista(PosicioneSopa[i][j], PosicioneSopa[i+1][j-1]);}
                catch (Exception e){}
                try{grafo.NuevaArista(PosicioneSopa[i][j], PosicioneSopa[i+1][j]);}
                catch (Exception e){}
                try{grafo.NuevaArista(PosicioneSopa[i][j], PosicioneSopa[i+1][j+1]);}
                catch (Exception e){}
            }
        }
    }
    
    public String imprimirAdyacentes (int v){
        //imprime Vertices Adyacentes de uno Solicitado
        String cadena = "";
        Vertice vertice = grafo.buscarVertice(v);
        Arista arista = vertice.getAdyacencia().getFirst();
        for (int i = 1; i < vertice.getAdyacencia().getNumAdy();i++){
            cadena += Integer.toString(arista.getDestino())+", ";
            arista = arista.getNext();
        }
        cadena += Integer.toString(arista.getDestino());
        return cadena;
    }
    
    public Pila buscarBFS (String palabra){
        Busqueda buscarBFS = new Busqueda ();
        return buscarBFS.buscarBFS(this.grafo, palabra.toUpperCase());
    }
    
    public Pila buscarDFS (String palabra){
        Busqueda_DFS buscarDFS = new Busqueda_DFS();
        return buscarDFS.BuscarDFS(this.grafo, palabra);
    }

    public char[][] getLetraSopa() {
        return LetraSopa;
    }

    public void setLetraSopa(char[][] LetraSopa) {
        this.LetraSopa = LetraSopa;
    }

    public int[][] getPosicioneSopa() {
        return PosicioneSopa;
    }

    public void setPosicioneSopa(int[][] PosicioneSopa) {
        this.PosicioneSopa = PosicioneSopa;
    }

    public int getNumCol() {
        return numCol;
    }

    public void setNumCol(int numCol) {
        this.numCol = numCol;
    }

    public int getNumFilas() {
        return numFilas;
    }

    public void setNumFilas(int numFilas) {
        this.numFilas = numFilas;
    }

    public Grafo getGrafo() {
        return grafo;
    }

    public void setGrafo(Grafo grafo) {
        this.grafo = grafo;
    }
            
        
        
}

>>>>>>> Stashed changes
