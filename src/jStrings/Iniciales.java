package jStrings;

import libs.Input;

public class Iniciales {

    public static void main(String[] args) {
       System.out.println("Ingrese nombre completo");
        String nombre = Input.get_string();
        //necesito sacar las iniciales
        Input.print(nombre.charAt(0));
        int numeroCaracteres = nombre.length();
        //para la primera inicial, saco el primer caracter de todo el nombre.
       int posicionActual= 1 ;
       while(posicionActual <= numeroCaracteres - 1) {
        char caracterActual= nombre.charAt(posicionActual);
        if (caracterActual == ' '){
            System.out.print(nombre.charAt(posicionActual + 1));

        }
        posicionActual ++;
       }
          //Input.print("El caracter numero " + i +" de la frase " + nombre + " es " + s.charAt(i) + "\n");

        //para sacar la siguiente inicial, saco caracter por caracter.  para cada cada caracter pregunto.  "eres espacio".  si la respuesta es si, imprimo el siguiente caracter.  y si no?  no imprimo nada





    }

}
