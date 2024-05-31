/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_grafos;

import EDD.Pila;
import Sopa_Letras.Busqueda;
import javax.swing.JOptionPane;
import Sopa_Letras.SopaLetras;

/**
 *
 * @author cgrc1
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String letras = "C, X, E, O, H, A, G, J, U, F, D, G, Z, G, A, Q";
        SopaLetras sopaletra = new SopaLetras (4,4);
        sopaletra.armarSopa(letras);
        
        
        //Bucle imprimir lista adyacencia (Prueba)
        while (true){
            /*String input = JOptionPane.showInputDialog("Inserte Nodo: ");
            if (input == "x"){break;}
            else{
            String cadena = sopaletra.imprimirAdyacentes(Integer.parseInt(input));
            JOptionPane.showMessageDialog(null, cadena);}*/
            
            String input = JOptionPane.showInputDialog("Inserte Palabra: ");
            if ("0".equals(input)){break;}
            else{
                Pila p = sopaletra.buscarBFS(input);
                p.imprimir();
            }
        }
    }
}
