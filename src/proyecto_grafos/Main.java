package proyecto_grafos;

import Interfaz.*;
import Sopa_Letras.SopaLetras;


public class Main {

    
    public static void main(String[] args) {
        SopaLetras sopaletra = new SopaLetras (4,4);
        InterfazPrincipal main = new InterfazPrincipal(sopaletra);
        main.setVisible(true);
    }
}

