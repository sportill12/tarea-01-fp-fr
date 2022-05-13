package examen;

import java.util.Scanner;

/**
 * pregunta1
 */
public class pregunta1 {

    static Scanner lt=new Scanner(System.in);
    
    public static void pregunta1examenFRFM() {

        // declarar variables
        String Nl;
        double Nec, NE, Ntp; 
        // datos de entrada 
    System.out.println("Ingrese las notas: ");
    System.out.println("Ingrese la nota del Examen de Conocimiento");
    Nec=lt.nextDouble();
    System.out.println("Ingrese la nota de la Entrevista Personal");
    NE=lt.nextDouble();
    System.out.println("Ingrese la nota del Test Psicologico");
    Ntp=lt.nextDouble();

         //Proceso

    double PEC = (Nec * 0.40);
    double PEP = (NE * 0.35);
    double PTP = (Ntp * 0.25);
    double promedio = (PEC + PEP + PTP);

    if (promedio>=17 && promedio<=20) {
        Nl="Su nivel es 4";
    } else if(promedio<17 && promedio>=14){
        Nl="Su nivel es 3";
    } else if(promedio<14 && promedio>=11){
        Nl="Su nivel es 2";
    } else if(promedio<11){
        Nl="usted No puede obtener vacante";
    } else {
        Nl="Notas no validas";
    }
    System.out.println(Nl);
 }

        //datos de salida

public static void main(String[] args) {
  pregunta1examenFRFM();
}
}