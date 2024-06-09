package Interfaz;

import EDD.Pila;
import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 * Clase funcionesInterfaz
 * clase auxiliar de la interfaz gráfica en la que se encuentran alguno de sus metodos
 * @author cgrc1
 */
public class funcionesInterfaz {

    private final InterfazPrincipal interfaz;

    /**
     * Constructor de la clase
     * @param interfaz interfaz grafica donde se quieren realizar los metodos
     */
    public funcionesInterfaz(InterfazPrincipal interfaz) {
        this.interfaz=interfaz;
    }
    
    /**
     * Metodo que se encarga de leer la lista de letras del diccionario de la sopa
     * y representarlas en el tablero
     */
    public void mostrarLetras (){
        String [] letras = interfaz.sopaletras.getDiccionario().getListaLetras().split(",");
        interfaz.getV0().setText(letras[0]);
        interfaz.getV1().setText(letras[1]);
        interfaz.getV2().setText(letras[2]);
        interfaz.getV3().setText(letras[3]);
        interfaz.getV4().setText(letras[4]);
        interfaz.getV5().setText(letras[5]);
        interfaz.getV6().setText(letras[6]);
        interfaz.getV7().setText(letras[7]);
        interfaz.getV8().setText(letras[8]);
        interfaz.getV9().setText(letras[9]);
        interfaz.getV10().setText(letras[10]);
        interfaz.getV11().setText(letras[11]);
        interfaz.getV12().setText(letras[12]);
        interfaz.getV13().setText(letras[13]);
        interfaz.getV14().setText(letras[14]);
        interfaz.getV15().setText(letras[15]);
    }
    
    /**
     * Funcion que se encarga de pintar en el tablero las letras de la palabra ingresada.
     * Se ser una lista de palabras, los colores los elige siguiendo un orden;
     * de ser una sola palabra, lo pinta con un color aleatorio de la lista
     * @param vertices variable de tipo pila que indica los vertices en los que se encuentran 
     * las letras de la palabra
     * @param n indica el numero de la palabra dentro de la lista, de recibir -1, indica que 
     * se busca pintar una palabra individual
     */
    public void colorearLetras (Pila vertices, int n){
        if (vertices.vacia()){
            JOptionPane.showMessageDialog(null, "Palabra no encontrada");
        }
        else{
            int i;
            if (n != -1){
                i = n-6*(n/6);}
            else {
                Random rand = new Random();
                i = rand.nextInt(6);}
            String color = buscarColor(i);
            while (!vertices.vacia()){
                int vertice = Integer.parseInt(vertices.getFirst().getDato());
                vertices.desapilar();
                aplicarColor(color, vertice);
            }
        }
    }
    
    /**
     * metodo que pinta una casilla del tablero
     * @param color variable de tipo string que indica el codigo hexadecimal del color que se quiera pintar
     * @param vertice variable de tipo entero que indica el numero del vertice que se desee pintar
     */
    public void aplicarColor(String color, int vertice){
        switch (vertice){
            case 0 -> interfaz.getV0().setBackground(Color.decode(color));
            case 1 -> interfaz.getV1().setBackground(Color.decode(color));
            case 2 -> interfaz.getV2().setBackground(Color.decode(color));
            case 3 -> interfaz.getV3().setBackground(Color.decode(color));
            case 4 -> interfaz.getV4().setBackground(Color.decode(color));
            case 5 -> interfaz.getV5().setBackground(Color.decode(color));
            case 6 -> interfaz.getV6().setBackground(Color.decode(color));
            case 7 -> interfaz.getV7().setBackground(Color.decode(color));
            case 8 -> interfaz.getV8().setBackground(Color.decode(color));
            case 9 -> interfaz.getV9().setBackground(Color.decode(color));
            case 10 -> interfaz.getV10().setBackground(Color.decode(color));
            case 11 -> interfaz.getV11().setBackground(Color.decode(color));
            case 12 -> interfaz.getV12().setBackground(Color.decode(color));
            case 13 -> interfaz.getV13().setBackground(Color.decode(color));
            case 14 -> interfaz.getV14().setBackground(Color.decode(color));
            case 15 -> interfaz.getV15().setBackground(Color.decode(color));
        }
    }
    
    /**
     * funcion de tipo string que busca un color en la lista dependiento del numero ingresado
     * los colores dependiendo del numero de entrada son:
     * 0-azul; 1-verde; 2-rojo; 3-morado; 4-amarillo; 5-rosa;
     * @param i variable de tipo entero que indica el numero del color deseado
     * @return string con el codigo hexadecimal del color
     */
    public String buscarColor (int i){
        String color = "";
        switch (i){
            case 0 -> color = "#2D9AEA";
            case 1 -> color = "#64FFA8";
            case 2 -> color = "#FF6064";
            case 3 -> color = "#6154A8";
            case 4 -> color = "#E4E86C";
            case 5 -> color = "#E467C4";       
        }
        return color;
    }
    
    /**
     * metodo que reinicia el tablero pintandolo completamente de blanco
     */
    public void colorReset(){
        interfaz.getV0().setBackground(Color.decode("#FFFFFF"));
        interfaz.getV1().setBackground(Color.decode("#FFFFFF"));
        interfaz.getV2().setBackground(Color.decode("#FFFFFF"));
        interfaz.getV3().setBackground(Color.decode("#FFFFFF"));
        interfaz.getV4().setBackground(Color.decode("#FFFFFF"));
        interfaz.getV5().setBackground(Color.decode("#FFFFFF"));
        interfaz.getV6().setBackground(Color.decode("#FFFFFF"));
        interfaz.getV7().setBackground(Color.decode("#FFFFFF"));
        interfaz.getV8().setBackground(Color.decode("#FFFFFF"));
        interfaz.getV9().setBackground(Color.decode("#FFFFFF"));
        interfaz.getV10().setBackground(Color.decode("#FFFFFF"));
        interfaz.getV11().setBackground(Color.decode("#FFFFFF"));
        interfaz.getV12().setBackground(Color.decode("#FFFFFF"));
        interfaz.getV13().setBackground(Color.decode("#FFFFFF"));
        interfaz.getV14().setBackground(Color.decode("#FFFFFF"));
        interfaz.getV15().setBackground(Color.decode("#FFFFFF"));
    }
    
    /**
     * metodo que se encarga de buscar todas las palabras del diccionario usando la metodologia BFS o DFS
     * @param fs variable de tipo string que indica la metodologia de busqueda deseada "BFS" o "DFS"
     */
    public void buscarTodas(String fs){
        if (interfaz.sopaletras.isSopaArmada()){
            long start = System.nanoTime();
            String palabrasEncontradas = "";
            String palabrasNoEncontradas = "";
            colorReset();
            String [] palabras = interfaz.sopaletras.getDiccionario().getListaPalabras().split("\r\n");
            for (int i = 0; i < palabras.length; i++){
                Pila posiciones = null;
                if ("BFS".equals(fs)){
                    posiciones = interfaz.sopaletras.buscarBFS(palabras[i]);}
                if ("DFS".equals(fs)){
                    posiciones = interfaz.sopaletras.buscarDFS(palabras[i]);}
                if (!posiciones.vacia()){
                   colorearLetras(posiciones, i); 
                   palabrasEncontradas += "\r\n     - " + palabras[i];
                }
                else {
                    palabrasNoEncontradas += "\r\n     - " + palabras[i];
                }
            }
            if ("".equals(palabrasEncontradas)){
                JOptionPane.showMessageDialog(null, "No se encontro ninguna palabra");
            }
            else{
                palabrasEncontradas = "Las palabras encontradas fueron:" + palabrasEncontradas;
                if (!"".equals(palabrasNoEncontradas)){
                    palabrasNoEncontradas = "\r\nLas palabras no encontradas fueron: " + palabrasNoEncontradas;}
                    JOptionPane.showMessageDialog(null, palabrasEncontradas + palabrasNoEncontradas);
                    long end = System.nanoTime() - start;
                    double endMilli = end / (double) 10000000;
                    interfaz.getTiempo().setText(String.format("%.4f", endMilli));
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "No se ha cargado ningun archivo de texto");
        }
    }
    
    /**
     * metodo que se encarga de buscar una palabra especifica en la sopa de letras usando la metodologia BFS o DFS
     * @param fs variable de tipo string que indica la metodologia de busqueda deseada "BFS" o "DFS"
     */
    public void buscarUna (String fs){
        if (interfaz.sopaletras.isSopaArmada()){
            String palabra = interfaz.getPalabra().getText();
            palabra = palabra.toUpperCase();
            palabra = interfaz.archivotxt.palabraValida(palabra);
            if (palabra != ""){
                long start = System.nanoTime();
                Pila posiciones = null;
                if ("BFS".equals(fs)){
                    posiciones = interfaz.sopaletras.buscarBFS(palabra);}
                if ("DFS".equals(fs)){
                    posiciones = interfaz.sopaletras.buscarDFS(palabra);}
                if (posiciones.vacia()){
                    JOptionPane.showMessageDialog(null, "Palabra no encontrada");
                    interfaz.getPalabra().setText("");
                }
                else{
                    colorReset();
                    colorearLetras(posiciones, -1);}
                    interfaz.getPalabra().setText("");
                    long end = System.nanoTime() - start;
                    double endMilli = end / (double) 10000000;
                    interfaz.getTiempo().setText(String.format("%.4f", endMilli));
            }
            else {
                JOptionPane.showMessageDialog(null, "Palabra no válida");
                interfaz.getPalabra().setText("");
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "No se ha cargado ningun archivo de texto");
        }
    }
}
