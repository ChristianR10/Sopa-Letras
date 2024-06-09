package Sopa_Letras;

import EDD.Pila;
import Grafo.*;

/**
 * Clase SopaLetras
 * Incluye todo lo referente a la construcción de la sopa de letras, así como sus principales métodos y funciones
 * @author Christian Ramos y Andrés Rojas
 * @version 1.0
 */
public class SopaLetras {
    
    /**
     * @param LetraSopa matriz que indica de forma ordenada las distintas letras de la sopa 
     * @param PosicioneSopa matriz que indica de forma ordenada la numeracion de los vertices
     * @param numCol indica la cantidad de columnas que posee la sopa de letras
     * @param numFilas indica la cantidad de filas que posee la sopa de letras
     * @param grafo variable de tipo grafo que indica el grafo formado por los vertices de la sopa de letras
     * @param diccionario variable de tipo diccionario que guarda la informacion de la sopa (letras y palabras)
     * @param sopaArmada variable de tipo boolean que indica si la sopa de letras ya fue armada
     */
    
    private char [][] LetraSopa; 
    private int [][] PosicioneSopa; 
    private int numCol; 
    private int numFilas; 
    private Grafo grafo;
    private Diccionario diccionario;
    private boolean sopaArmada;

    /**
     * Constructor de la clase SopaLetras, recibe como entrada dos parámetros
     * @param x variable de tipo entero que indica el número de filas que se desea que posea la sopa de letras
     * @param y variable de tipo entero que indica el número de columnas que se desea que posea la sopa de letras
     * @author Christian Ramos
     */
    public SopaLetras(int x, int y) {
        this.LetraSopa = new char [x][y];
        this.PosicioneSopa = new int [x][y];
        this.numCol = y;
        this.numFilas = x;
        this.grafo = new Grafo();
        this.diccionario = new Diccionario();
        this.sopaArmada = false;
    }
    
    /**
     * Método que genera la sopa de letras en base al archivo txt ingresado. 
     * @param cadena variable de tipo String que incluye la lectura entera del txt
     * @author Christian Ramos
     */
    public void armarSopa (String cadena){
        this.diccionario.LeerTxT(cadena);
        crearVertices(diccionario.getListaLetras(), grafo);
        crearAristas (grafo);
        this.sopaArmada = true;
        
    }
    
    /**
     * Método auxiliar del método armarSopa que se encarga de agregar los vértices al grafo
     * @param letras variable de tipo string que recibe todas las letras de la sopa
     * @param grafo variable de tipo grafo que indica la estructura grafo que posee la sopa de letras
     * @author Christian Ramos
     */
    public void crearVertices (String letras, Grafo grafo){
        String [] parts = letras.split(",");
        int z = 0;
        for (int i=0;i<numFilas;i++){
            for (int j=0;j<numCol;j++){
                LetraSopa [i][j] = parts[z].toUpperCase().charAt(0); 
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
     * @author Christian Ramos
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
     * @author Christian Ramos
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
     * @author Christian Ramos
     */
    public Pila buscarBFS (String palabra){
        Busqueda_BFS buscarBFS = new Busqueda_BFS ();
        return buscarBFS.buscarBFS(this.grafo, palabra.toUpperCase());
    }
    
    /**
     * Función que busca una palabra en la sopa de letra usando la metodología DFS
     * @param palabra variable de tipo String que indica la palabra que se desea buscar
     * @return Pila ordenada con los distintos vértices donde se encuentran las letras de la palabra
     * @author Andrés Rojas
     */
    public Pila buscarDFS (String palabra){
        Busqueda_DFS buscarDFS = new Busqueda_DFS();
        return buscarDFS.BuscarDFS(this.grafo, palabra.toUpperCase());
    }


    /**
     * @return variable interna LetraSopa
     */
    public char[][] getLetraSopa() {
        return LetraSopa;
    }

    /**
     * modifica la variable interna LetraSopa
     * @param LetraSopa nueva variable de tipo matriz
     */
    public void setLetraSopa(char[][] LetraSopa) {
        this.LetraSopa = LetraSopa;
    }

    /**
     * @return variable interna PosicioneSopa
     */
    public int[][] getPosicioneSopa() {
        return PosicioneSopa;
    }

    /**
     * modifica la variable interna PosicioneSopa
     * @param PosicioneSopa nueva variable de tipo matriz
     */
    public void setPosicioneSopa(int[][] PosicioneSopa) {
        this.PosicioneSopa = PosicioneSopa;
    }

    /**
     * @return variable interna numCol
     */
    public int getNumCol() {
        return numCol;
    }

    /**
     * modifica la variable interna numCol
     * @param numCol nueva variable de tipo numCol
     */
    public void setNumCol(int numCol) {
        this.numCol = numCol;
    }

    /**
     * @return variable interna numFilas
     */
    public int getNumFilas() {
        return numFilas;
    }

    /**
     * modifica la variable interna numFilas
     * @param numFilas nueva variable de tipo numFilas
     */
    public void setNumFilas(int numFilas) {
        this.numFilas = numFilas;
    }

    /**
     * @return variable interna grafo
     */
    public Grafo getGrafo() {
        return grafo;
    }

    /**
     * modifica la variable interna grafo
     * @param grafo nueva variable de tipo grafo
     */
    public void setGrafo(Grafo grafo) {
        this.grafo = grafo;
    }

    /**
     * @return variable interna diccionario
     */
    public Diccionario getDiccionario() {
        return diccionario;
    }

    /**
     * modifica la variable interna diccionario
     * @param diccionario nueva variable de tipo diccionario
     */
    public void setDiccionario(Diccionario diccionario) {
        this.diccionario = diccionario;
    }  

    /**
     * @return variable interna sopaArmada
     */
    public boolean isSopaArmada() {
        return sopaArmada;
    }

    /**
     * modifica la variable interna sopaArmada
     * @param sopaArmada nueva variable de tipo boolean
     */
    public void setSopaArmada(boolean sopaArmada) {
        this.sopaArmada = sopaArmada;
    }  
}

