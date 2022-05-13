package examen;

import java.util.Scanner;

/**
 * pregunta5
 */
public class pregunta5 {
    static Scanner lt= new Scanner(System.in);

    public static void main(String[] args) {
    
        System.out.println("Ingrese la pregunta");
        int pregunta = lt.nextInt();
        switch (pregunta) 
        {
          case 1:
          pregunta1examenFRFM() ; break;
          case 2:
          pregunta2examenFRFM() ; break;
          case 3:
          pregunta3examenFRFM(); break;
          case 4:
          pregunta4examenFRFM(); break;
            
            default: break;
        }

        }
        

        }