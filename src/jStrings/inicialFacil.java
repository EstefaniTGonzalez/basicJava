package jStrings;

import libs.Input;

    public class inicialFacil {
        //este programa le pide el nombre a un usuario, y luego imprime las iniciales en mayusculas.

        // como lo hace?

        //almacena el nombre del usuario en una variable en un String
        // voy a sacar letra por letra del nombre.
        //si la letra es mayuscula, la imprimo
        public static void main(String[] args) {
            String nombreCompleto = "Beatriz Arenas";
            System.out.println(nombreCompleto);
            //necesito saber cuantas letras tiene mi nombre
            int esMayuscula=0;
            int numeroLetrasTotal = nombreCompleto.length();
            char letra0 = nombreCompleto.charAt(0);
            //si la letra cero es mayuscula, imprimela
            if(esMayuscula(letra0)) {
                System.out.print(letra0);
            }
            char letra1 = nombreCompleto.charAt(1);
            if(esMayuscula(letra0)) {
                System.out.print(letra0);
            }

            char letra2 = nombreCompleto.charAt(2);
            if(esMayuscula(letra0)) {
                System.out.print(letra0);
            }
            char letra3 = nombreCompleto.charAt(3);
            if(esMayuscula(letra0)) {
                System.out.print(letra0);
            }
            char letra4 = nombreCompleto.charAt(4);
            if(esMayuscula(letra0)) {
                System.out.print(letra0);
            }
            char letra5 = nombreCompleto.charAt(5);
            if(esMayuscula(letra0)) {
                System.out.print(letra0);
            }

            char letra6 = nombreCompleto.charAt(6);
            if(esMayuscula(letra0)) {
                System.out.print(letra0);
            }
            char letra7 = nombreCompleto.charAt(7);
            if(esMayuscula(letra0)) {
                System.out.print(letra0);
            }
            char letra8 = nombreCompleto.charAt(8);
            if(esMayuscula(letra0)) {
                System.out.print(letra0);
            }
            char letra9 = nombreCompleto.charAt(9);
            if(esMayuscula(letra0)) {
                System.out.print(letra0);
            }
            char letra10 = nombreCompleto.charAt(10);
            if(esMayuscula(letra0)) {
                System.out.print(letra10);
            }
            char letra11 = nombreCompleto.charAt(11);
            if(esMayuscula(letra11)) {
                System.out.print(letra11);
            }
            char letra12 = nombreCompleto.charAt(12);
            if(esMayuscula(letra12)) {
                System.out.print(letra12);
            }
            char letra13 = nombreCompleto.charAt(13);
            if(esMayuscula(letra13)) {
                System.out.print(letra13);
            }
            while (esMayuscula >=65 && esMayuscula <=90) {
                esMayuscula = letra0;

            }


        }
        //usando el codigo ascii, sabemos que si el valor numerico de una letra es mayor o igual a 65, pero menor o igual a 90,
        //entonces es mayuscula


        private static boolean esMayuscula(char letra0) {
            //voy a convertir la letra en numero
            int valorNumericoLetra = (int) letra0;
            //y luego la voy a comparar para ver si es mayor o igual a 65, y menor o igual a 90

            while (letra0 >=65 && letra0 <=90) {
                valorNumericoLetra = letra0;

            }

            return false;
        }
    }
