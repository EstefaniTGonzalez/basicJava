package jStrings;

import libs.Input;

import static java.lang.Integer.toHexString;

public class ConversionNumero {
    public static void main(String[] args) {
        //Cree un programa que convierta un numero decimal en hexadecimal:
        int numero;
        //pedir al usuario un numero
        System.out.println("Ingrese un numero positivo: ");
        numero = Input.get_int();
        //operacion
        if( numero > 0 ){
        String resul = toHexString(numero);
            System.out.println("La conversion a hexadecimal es: " +  resul);
        }
        else if ( numero <= 0 ) {
            //mostrar resultado
            System.out.println("Ingrese un numero positivo: ");
        }

    }
}
