package jStrings;

import libs.Input;

public class OperacionesMatematicas {
    //Escriba un programa que permita al usuario ingresar dos valores numericos,
    // e imprima el resultado de sumar, rester, multiplicar y dividir esos dos valores


    public static void main(String[] args) {

        //declarar los dos numeros que va ingresar el usuario
        double suma, resta, mult, div;
        //pedir al usuario dos numeros
        System.out.println("Ingrese un numero Uno: ");
        int numUno = Input.get_int();
        System.out.println("Ingrese un numero Dos: ");
        //operacion
        int numDos = Input.get_int();
        suma = numDos+numDos;
        resta = numDos-numDos;
        mult = numDos*numDos;
        div = numDos/numDos;
        //mostrar resultado
        System.out.println("La suma de " + numUno + " + " + numDos + " = " + suma);
        System.out.println("La resta de " + numUno + " - " + numDos + " = " + resta);
        System.out.println("La multiplicacion de " + numUno + " * " + numDos + " = " + mult);
        System.out.println("La division de " + numUno + " / " + numDos + " = " + div);




    }
}
