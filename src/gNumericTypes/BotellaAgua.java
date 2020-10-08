package gNumericTypes;

import libs.Input;

public class BotellaAgua {
    static int numeroBotella;
    static int numeroMinutos;

    public static void main(String[] args) {
        System.out.println("Ingrese numero de minutos usados");
        numeroMinutos= Input.get_int();
        numeroBotella= numeroMinutos * 12;
        System.out.println("El numero de botellas usadas es:" + numeroBotella);
    }
}
