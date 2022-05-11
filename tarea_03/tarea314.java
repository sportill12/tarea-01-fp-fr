package tarea_03;

import java.util.Scanner;

/**
 * tarea314
 */
public class tarea314 {

    static Scanner lt=new Scanner(System.in);

    public static void main(String[] args) {

        //Declarar Variables

        double horas;
        
        //Datos de entrada

        System.out.println("Ingrese la cantidad de horas:");
        horas=lt.nextInt();
    

        //Proceso
        if (horas>=0 && horas<=2) {
            horas=horas*5;

        } else if( horas>2 && horas<=5){
            horas=4*horas;

        } else if( horas>5 && horas<=10){
            horas=3*horas;
        } else if( horas>10){
            horas=2*horas;
        }
        //Datos de salida
        System.out.println("la cantidad a pagar es: "+horas);
    }
   
}