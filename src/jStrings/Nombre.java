package jStrings;

import libs.Input;

public class Nombre {
    public static void main(String[] args) {


           //Escriba un programa que pregunte el nombre al usuario, y le conteste Hola, <nombre>
          //pedir al usuario su nombre
          System.out.println("Cual es tu nombre ");
          String nombre = Input.get_string();
          // Mostrar nombre ingresado
          System.out.println("Hola, " + nombre);

    }
}
