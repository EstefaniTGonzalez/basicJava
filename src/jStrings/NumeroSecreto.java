package jStrings;

import libs.Input;

import java.util.Random;

public class NumeroSecreto {
    public static void main(String[] args) {
        //Cree un programa que genere un numero secreto entre 0 y 10, y que pida al usuario adivinar el numero.  Solo de un intento.
        int numeroSecreto = new Random().nextInt(11);
        int numero = 0;
        int intentos = 1;

        System.out.println("Ingrese numero secreto de 0 a 10 para adivinarlo: ");
        numero = Input.get_int();
        //comparar numero ingresado si esta en el entre 0 y 10
        if (numero < 0 || numero > 10) {
            System.out.println("error el numero ingresado no esta entre 0 a 10.");
            // los numeros son iguales

        } else if (numero == numeroSecreto) {
            System.out.println("Correcto Adivinaste el numero secreto es: " + numeroSecreto);
        }else{
            System.out.println("Ingresaste el numero incorrecto, el numero secreto es: " + numeroSecreto);
        }
    }

}
