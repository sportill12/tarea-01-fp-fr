package examen;

import java.util.Scanner;

/**
 * pregunta4
 */
public class pregunta4 {

    static Scanner lt=new Scanner(System.in);

    public static void pregunta4examenFRFM() {
        int edad;
    String sex;
    String vacuna; 

    //Datos de Entrada

    System.out.print("Ingrese la edad del paciente:");
    edad=lt.nextInt();

    //Proceso
    
    if (edad>69) {
        vacuna="La vacuna que le corresponde es C";
    }else if(edad>16){
        System.out.println("Ingrese el sexo (F=femenino y M=masculino)");
        sex=lt.next();
        vacuna="La vacuna que le corresponde es B"; 
    } else if(edad<16){
        vacuna="La vacuna que le corresponde es A";
    } else {
        vacuna="La vacuna que le corresponde es  A";
    }    
    
    System.out.println(vacuna);
}

public static void main(String[] args) {
    pregunta4examenFRFM();
}
        
    }
