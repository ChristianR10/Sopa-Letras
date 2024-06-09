package proyecto_grafos;

import Interfaz.*;

/**
 * Clase main
 * Inicializa el proyecto y abre la interfaz gráfica
 * @author Christian Ramos
 * @version 1.0
 */
public class Main {

    /**
     *Funcion principal que inicia el proyecto
     * @param args necesario para que se inicie el main
     */
    public static void main(String[] args) {
        InterfazPrincipal main = new InterfazPrincipal();
        main.setVisible(true);
    }
}

