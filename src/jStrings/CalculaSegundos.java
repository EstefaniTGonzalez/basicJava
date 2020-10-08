package jStrings;

import libs.Input;

public class CalculaSegundos {
    public static void main(String[] args) {
        //primero le pide al usuario los minutos y segundos del video
        System.out.print("Duracion del video(mm:ss): ");
        String duracionTotal = Input.get_string();

        int[] calificaciones;
        double[] precios;
        char[] sexos = {'m', 'f'};


        String[] duracionVideo = duracionTotal.split(":");
        if(duracionVideo.length == 2) {
            String minutosTexto = duracionVideo[0];
            String segundosTexto = duracionVideo[1];
            int minutos = Integer.parseInt(minutosTexto);
            int segundos = Integer.parseInt(segundosTexto);
            int totalSegundos = 60 * minutos + segundos;
            // le informa al usuario
            System.out.println("el video dura " + totalSegundos + " segundos.");

        }else {
            System.out.println("Error de formato.  ");
        }
        // calcula cuantos segundos hay en x minuos y segundos

    }
}//el programa acepta letras y muestra un error raro
//el programa acepta datos invalidos de minutos y segundos
//el programa no alerta al usuario cuando el formato esta incorrecto:  el usuario le puso ;
//el programa no detecta que le puse horas, minutos y segundos.

