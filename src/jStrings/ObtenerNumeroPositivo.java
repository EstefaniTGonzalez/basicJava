package jStrings;

import libs.Input;

public class ObtenerNumeroPositivo {
    public static void main(String[] args) {
        int numeroDeseado = -1;
        System.out.println("Dame un numero positivo: ");
        numeroDeseado = Input.get_int();

        while( numeroDeseado < 0) { //while terco.  se puede ejecutar miles de veces, hasta que la condicion no se cumpla.
            System.out.println("El numero no es valido.  Vuelvelo a intentar");
            numeroDeseado = Input.get_int();
        }
    }
}
