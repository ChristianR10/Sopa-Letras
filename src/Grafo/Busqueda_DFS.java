package Grafo;

import EDD.Pila;

/**
 *
 * @author Andrés Rojas
 */
public class Busqueda_DFS {
    private Pila Palabra;
    private Grafo SopaDeLetras;
    private Pila PalabraEncontrada;
    private Pila CopiaInvertida;
    private Boolean WordFound;

    /**
     *
     */
    public Busqueda_DFS(){
        this.PalabraEncontrada = new Pila();
        this.Palabra = new Pila();
        this.CopiaInvertida = new Pila();
        this.WordFound = false;
    }

    /**
     *
     * @param G Grafo de la sopa de letras, donde se buscará la palabra
     * @param Palabra String de la palabra a buscar
     * @return Devuelve una pila con las posiciones ordenadas de las letras de la palabra buscada, si es encontrada,
     * en su defecto, devuelve una lista vacía
     */
    public Pila BuscarDFS(Grafo G, String Palabra){

        this.SopaDeLetras = G;
        Vertice Iter = this.SopaDeLetras.getFirst();
        this.Palabra.apilarPalabraInv(Palabra);
        while(Iter != null){
            if(Iter.getDato() == this.Palabra.getFirst().getDato().charAt(0)){
                this.PalabraEncontrada.apilar(Integer.toString(Iter.getPosicion()));
                DFS(Iter);
                if(WordFound){break;}
            }
            this.PalabraEncontrada.desapilar();
            Iter = Iter.getNext();
        }
        return this.PalabraEncontrada;
    }
    /**
     * 
     * @param Root Nodo que se tomará como la raíz del árbol para realizar la búsqueda DFS
     */
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
    /**
     * 
     * @return devuelve un booleano indicando si la palabra encontrada es válida
     */
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
    /**
     * @return No devuelve nada, procedimiento recursivo que crea una copia de la pila para comparar
     */ 
    private void Invertir(){
        if(!this.PalabraEncontrada.vacia()){
            String elem = this.PalabraEncontrada.getFirst().getDato();
            this.PalabraEncontrada.desapilar();
            this.CopiaInvertida.apilar(elem);
            Invertir();
            this.PalabraEncontrada.apilar(elem);
        }
    }
    /**
     * @return No devuelve nada, manda a crear una copia de la pila que se va a comprobar y vacía el atributo CopiaInvertida
     */
    private void CrearCopia(){
        this.CopiaInvertida.VaciarPila();
        Invertir();
    }
}
