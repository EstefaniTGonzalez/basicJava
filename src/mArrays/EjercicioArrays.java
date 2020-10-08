package mArrays;

public class EjercicioArrays {

    public class NumeroRepetido {
        public static void main(String[] args) {
            int numerosRepetidos[] = {1, 2, 3, 4, 3};

            //hallar el numero repetido
            //coger el primer numero.
            //buscar en el arreglo ese mismo numero.
            //si lo encuentra, imprime "el numero " + x + " esta repetido"

            // si no?
            //coge el siguiente numero.

            for( int i = 0; i < numerosRepetidos.length; i++) {
                int actual = numerosRepetidos[i];
                boolean estaRepetido = buscarRepetidos(numerosRepetidos, actual, i + 1);
                if(estaRepetido) {
                    System.out.println("El numero " + actual + " esta repetido.");
                    break;
                }
            }

        }

        public static boolean buscarRepetidos(int []numerosRepetidos, int actual, int contadorInicial) {

            for(int i = contadorInicial; i < numerosRepetidos.length; i++) {
                if(numerosRepetidos[i] == actual) {
                    return true;
                }
            }

            return false;

        }
}
