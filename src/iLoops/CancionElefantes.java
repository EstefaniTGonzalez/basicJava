package iLoops;

import libs.Input;

public class CancionElefantes {
      public static void main(String[] args){

          int numElf=1;
          int numTot=0;

          System.out.println("Cuantos elefantes quieres?" );
          numTot= Input.get_int();

          while  (numElf<=numTot)         {
              System.out.println(numElf + " elefante se columpiaba sobre la tela de una araña, como veia que resistia, fue a llamar a otro elefante\n");
             numElf+=1;
          }
          if (numElf==1){

          }
        else
            {
            Input.print(numElf + ' ' + " elefantes se columpiaban sobre la tela de una araña, como veia que resistia, fue a llamar a otro elefante\n");
          }

      }
}
