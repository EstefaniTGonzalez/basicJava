package jStrings;

import libs.Input;

public class NumerosOrdenados {
    public static void main(String[] args) {
        //Escriba un programa que pida al usuario dos numeros enteros, y los imprima en orden.
        int num1, num2, num3, numorden = 0, x;
        //pedir al usuario dos numeros
        System.out.println("Ingrese un numero : ");
        num1 = Input.get_int();
        System.out.println("Ingrese un numero : ");
        num2 = Input.get_int();
        //operacion
        if ( num1 < num2){
            System.out.print("el orden correcto es : "+num1+" - "+num2);
        }
        else
            System.out.print("el orden de menor a mayor es : "+num2+" - "+num1);

        }

}
