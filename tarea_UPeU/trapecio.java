import java.util.Scanner;

public class tarea {
  public static void main(String[] args){
        //definir variables
 double area, B, b, h;
  //datos de entrada
  Scanner it=new Scanner(System.in);
  System.out.print("B: ");
B=it.nextDouble();
System.out.print("b: ");
b=it.nextDouble();
    System.out.print("H: ");
h=it.nextDouble();
//proceso
area=(B+b)/2*h;

//datos de salida
System.out.println("area es igual a: "+area);
  }
  }