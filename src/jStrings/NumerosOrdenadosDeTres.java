package jStrings;

public class NumerosOrdenadosDeTres {

    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;

        num1 = 15;
        num2 = 4;
        num3 = 222;

        //2 - 4 - 5

        //encontrar el mas grande de los tres.
        int masGrande = encontrarElMasGrande(num1, num2, num3);
        int candidato1, candidato2, candidato3;
        candidato1 = candidato2 = candidato3 = Integer.MIN_VALUE;
        if(num1 != masGrande) {
            candidato1 = num1;
        }
        if(num2 != masGrande) {
            candidato2 = num2;
        }
        if(num3 != masGrande) {
            candidato3 = num3;
        }

        int medio = encontrarElMasGrande(candidato1, candidato2, candidato3);

        int masChico;
        candidato1 = candidato2 = candidato3 = Integer.MIN_VALUE;
        if(num1 != masGrande && num1 != medio) {
            candidato1 = num1;
        }
        if(num2 != masGrande && num2 != medio) {
            candidato2 = num2;
        }
        if(num3 != masGrande && num3 != medio) {
            candidato3 = num3;
        }

        masChico = encontrarElMasGrande(candidato1, candidato2, candidato3);

        System.out.println(masChico + "-" + medio + "-" + masGrande);
    }

    private static int encontrarElMasGrande(int num1, int num2, int num3) {
        int temp = num1;
        if(num2 > temp) {
            temp= num2;
        }
        if(num3 > temp) {
            temp = num3;
        }
        return temp;
    }
}
