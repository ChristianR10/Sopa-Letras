/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ValidacionesTXT;

/**
 *
 * @author cgrc1
 */
public class LecturaTXT {

    public LecturaTXT() {
    }
    
    //poner una funcion general con las validaciones y haga validadciones en el txt
    //retorna 0 txt valido sin modificaciones
    //retorna 1 txt valido con modificaciones menores
    //retorna 2 txt no valido
    public int comprobacionTXT(String txt){
        Validaciones validacion = new Validaciones();
        if (!validacion.numeroLetras(txt)){/*imprime numero de letras incorrecto*/}
        return 0;
    }
    
    //en caso de que haya que modificar algun detalle palabra (acento)o haya que anexar alguna, que esta funcion retorne la nueva cadena , 
    public String palabrasCorregidas(String txt){
        String palabra ="";
        return palabra;
    }
    
    //en caso de que haya que modificar las letras, que esta funcion lo retorne

    public String letrasCorregidas (String txt){
        String palabra = "";
        return palabra;
    }
    
    //funcion para construir un nuevo txt en base a modificaciones
    //(realizar si hay modificaciones en la validacion o si se agrega una nueva palabra)

    public String nuevoTXT (String TxT){
        String palabras = palabrasCorregidas(TxT);
        String letras = letrasCorregidas (TxT);
        String txt = "dic\r\n" + palabrasCorregidas(palabras) +"\r\n/dic\r\ntab\r\n" + letrasCorregidas (letras) + "\r\n/tab";
        return txt;
    }
    
    //funcion para verificar si una palabra es valida
    //que solo tenga letras, no tenga acentos, min 3 letras y eso
    public boolean palabraValida (String palabra){
        return true;
    }
    
}

