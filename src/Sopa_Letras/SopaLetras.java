package Sopa_Letras;

/**
 * Clase SopaLetras
 * Incluye todo lo referente a la construcción de la sopa de letras, así como sus principales métodos y funciones
 * @author Christian Ramos
 * @version 1.0
 */

import EDD.Pila;
import Grafo.Arista;
import Grafo.Grafo;
import Grafo.Vertice;

public class SopaLetras {
    
    /**
     * @param LetraSopa matriz que indica de forma ordenada las distintas letras de la sopa 
     * @param PosicioneSopa matriz que indica de forma ordenada la numeracion de los vertices
     * @param numCol indica la cantidad de columnas que posee la sopa de letras
     * @param numFilas indica la cantidad de filas que posee la sopa de letras
     * @param grafo variable de tipo grafo que indica el grafo formado por los vertices de la sopa de letras
     */
    
    char [][] LetraSopa; //Matriz usando las letras
    int [][] PosicioneSopa; //Matriz usando el numero de vertice
    int numCol; //Nro. Columnas de la matriz
    int numFilas; //Nro. Filas de la matriz
    Grafo grafo;
    Diccionario diccionario;

    /**
     * Constructor de la clase SopaLetras, recibe como entrada dos parámetros
     * @param x variable de tipo entero que indica el número de filas que se desea que posea la sopa de letras
     * @param y variable de tipo entero que indica el número de columnas que se desea que posea la sopa de letras
     */
    public SopaLetras(int x, int y) {
        this.LetraSopa = new char [x][y];
        this.PosicioneSopa = new int [x][y];
        this.numCol = y;
        this.numFilas = x;
        this.grafo = new Grafo();
        //this.diccionario = new Diccionario();
    }
    
    /**
     * Método que generar la sopa de letras. Recibe como parámetro un String ordenado con todas las letras
     * y genera los vértices y aristas correspondientes
     * @param cadena variable de tipo String que indica de forma ordenada todas las letras de 
     * la sopa de letras separadas por ", "
     */
    public void armarSopa (String cadena){
        this.diccionario.LeerTxT(cadena);
        String letras = diccionario.getListaLetras();
        String [] parts = letras.split(",");
        parts = letras.split(" ");
        crearVertices(parts, grafo);
        crearAristas (grafo);
        
    }
    
    /**
     * Método auxiliar del método armarSopa que se encarga de agregar los vértices al grafo
     * @param parts variable de tipo String que indica la letra que se desea que tenga el vértice como dato
     * @param grafo variable de tipo grafo que indica la estructura grafo que posee la sopa de letras
     */
    public void crearVertices (String [] parts, Grafo grafo){
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
    
    /**
     * Método auxiliar del método armarSopa que se encarga de agregar las aristas al grafo dependiendo de las 
     * adyacencias de los vértices
     * @param grafo variable de tipo grafo que indica la estructura grafo que posee la sopa de letras
     */
    public void crearAristas (Grafo grafo){
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
    
    /**
     * Función de tipo String que genera un string con el número de todos los vértices adyacentes
     * a uno en específico
     * @param v variable de tipo entero que indica el número del vértice del que se desea conocer los 
     * adyacentes
     * @return String con todos los vértices adyacentes
     */
    public String imprimirAdyacentes (int v){
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
    
    /**
     * Función que busca una palabra en la sopa de letra usando la metodología BFS
     * @param palabra variable de tipo String que indica la palabra que se desea buscar
     * @return Pila ordenada con los distintos vértices donde se encuentran las letras de la palabra
     */
    public Pila buscarBFS (String palabra){
        Busqueda buscarBFS = new Busqueda ();
        return buscarBFS.buscarBFS(this.grafo, palabra.toUpperCase());
    }
    
    public Pila buscarDFS (String palabra){
        Busqueda_DFS buscarDFS = new Busqueda_DFS();
        return buscarDFS.BuscarDFS(this.grafo, palabra);
    }

    
    //getter and setter
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

    public Diccionario getDiccionario() {
        return diccionario;
    }

    public void setDiccionario(Diccionario diccionario) {
        this.diccionario = diccionario;
    }       
}

