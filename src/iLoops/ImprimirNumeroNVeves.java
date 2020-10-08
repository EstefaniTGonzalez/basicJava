package iLoops;

public class ImprimirNumeroNVeves {


        public static void main(String[] args) {
        int numeroRenglones = 5;
        int numRenglonActual = 1;

        while(numRenglonActual <= numeroRenglones) {
            int numeroImprimir = numRenglonActual;
            int numeroImpresiones = numeroImprimir;
            int contador = 0;
            while (contador < numeroImpresiones){
                System.out.print(numeroImprimir);
                contador++;
            }
            System.out.println();
            numRenglonActual++;
        }
    }
}
