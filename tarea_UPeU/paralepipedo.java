import java.util.Scanner;

public class tarea {
  public static void main(String[] args){
        //definir variables
 double volumen, altura, ancho, largo;
  //datos de entrada
  Scanner it=new Scanner(System.in);
  System.out.print("ancho: ");
altura=it.nextDouble();
System.out.print("altura: ");
ancho=it.nextDouble();
    System.out.print("largo: ");
largo=it.nextDouble();
//proceso
volumen=ancho*largo*altura;

//datos de salida
System.out.println("Volumen: "+volumen);
  }
  }