package proyecto_grafos;

import EDD.Pila;
import Interfaz.InterfazPrincipal;
import javax.swing.JOptionPane;
import Sopa_Letras.SopaLetras;
import javax.swing.JFileChooser;

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
        
        //String letras = "L, T, O, R, A, G, N, O, F, U, A, G, P, L, E, O";
        //String letras = "C, X, E, O, H, A, G, J, U, F, D, G, Z, G, A, Q";
        //String letras = "G, U, X, X, U, A, X, X, G, G, G, A, U, U, X, U";
        
        SopaLetras sopaletra = new SopaLetras (4,4);
        //sopaletra.armarSopa(letras);
        InterfazPrincipal main = new InterfazPrincipal(sopaletra);
        main.setVisible(true);
        
        //Bucle imprimir lista adyacencia (Prueba)
        /*while (true){
            try{
                String input = JOptionPane.showInputDialog("Inserte Nodo: ");
                if (input == "x"){break;}
                else{
                String cadena = sopaletra.imprimirAdyacentes(Integer.parseInt(input));
                JOptionPane.showMessageDialog(null, cadena);}


                String input = JOptionPane.showInputDialog("Inserte Palabra: ");
                if ("0".equals(input)){break;}
                else{
                    Pila p = sopaletra.buscarBFS(input);
                    if (p.getFirst()!= null){p.imprimirInv();}
                    else {JOptionPane.showMessageDialog(null,"Palabra no encontrada");}
                }
            }
            catch (Exception e){break;}
        }
        */
    }
}

