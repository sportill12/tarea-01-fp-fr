package tarea_03;

import java.util.Scanner;

/**
 * ejercicio31
 */
public class ejercicio31 {

    static Scanner lt=new Scanner(System.in);
    public static void main(String[] args) {
        //Declarar Variables
        int edad;
        String mensaje;
        //Datos de entrada
        System.out.println("Ingrese la edad:");
        edad=lt.nextInt();
        //Proceso
        if (edad>=18) {
            mensaje="Puede votar porque su edad es "+edad;
        } else {
            mensaje="No puede votar porque su edad es "+edad;
        }
        //Datos de Salida
        System.out.println(mensaje);        
    }
}