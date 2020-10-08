package jStrings;

import libs.Input;

public class NumeroNegativoPositivo {
    public static void main(String[]args){
        //Escriba un programa que pida un numero al usuario e imprima si es positivo o negativo.

        //pedir al usuario dos numeros
        int num;
        System.out.println("Ingrese un numero");
        num = Input.get_int();
        //operacion
        if(num>0)
            System.out.println("El numero es positivo");
        else
            System.out.println("El numero es negativo");
    }
}
