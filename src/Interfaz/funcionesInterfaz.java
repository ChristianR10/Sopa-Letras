/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import EDD.Pila;
import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author cgrc1
 */
public class funcionesInterfaz {

    private final InterfazPrincipal interfaz;
    public funcionesInterfaz(InterfazPrincipal interfaz) {
        this.interfaz=interfaz;
    }
    
    public void mostrarLetras (){
        interfaz.getV0().setText(interfaz.sopaletras.getDiccionario().getListaLetras()[0]);
        interfaz.getV1().setText(interfaz.sopaletras.getDiccionario().getListaLetras()[1]);
        interfaz.getV2().setText(interfaz.sopaletras.getDiccionario().getListaLetras()[2]);
        interfaz.getV3().setText(interfaz.sopaletras.getDiccionario().getListaLetras()[3]);
        interfaz.getV4().setText(interfaz.sopaletras.getDiccionario().getListaLetras()[4]);
        interfaz.getV5().setText(interfaz.sopaletras.getDiccionario().getListaLetras()[5]);
        interfaz.getV6().setText(interfaz.sopaletras.getDiccionario().getListaLetras()[6]);
        interfaz.getV7().setText(interfaz.sopaletras.getDiccionario().getListaLetras()[7]);
        interfaz.getV8().setText(interfaz.sopaletras.getDiccionario().getListaLetras()[8]);
        interfaz.getV9().setText(interfaz.sopaletras.getDiccionario().getListaLetras()[9]);
        interfaz.getV10().setText(interfaz.sopaletras.getDiccionario().getListaLetras()[10]);
        interfaz.getV11().setText(interfaz.sopaletras.getDiccionario().getListaLetras()[11]);
        interfaz.getV12().setText(interfaz.sopaletras.getDiccionario().getListaLetras()[12]);
        interfaz.getV13().setText(interfaz.sopaletras.getDiccionario().getListaLetras()[13]);
        interfaz.getV14().setText(interfaz.sopaletras.getDiccionario().getListaLetras()[14]);
        interfaz.getV15().setText(interfaz.sopaletras.getDiccionario().getListaLetras()[15]);
    }
    
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
    
}
