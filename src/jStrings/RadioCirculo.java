package jStrings;

import libs.Input;

public class RadioCirculo {
    public static void main(String[] args) {

        //Escriba un programa que le pida al usuario el radio de un circulo e imprima su area y circumferencia:
        //Pedir  al usuario el radio de un circulo
        int radio;
        System.out.print( "Digite el radio del círculo: ");
        radio = Input.get_int();
        //Realizar calculo
        double area, circunferencia;
        area = Math.PI * Math.pow(radio, 2);
        circunferencia = (2 * Math.PI * radio);
        //imprima su area y circumferencia
        System.out.println("La circunferencia es: " + circunferencia);
        System.out.println("Area es: " + area);


    }
}
