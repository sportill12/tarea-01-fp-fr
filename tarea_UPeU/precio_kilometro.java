import java.util.Scanner;

public class tarea {
  public static void main(String[] args){
        //definir variables
 double kilometros, costo, resultado;
  //datos de entrada
  Scanner it=new Scanner(System.in);
  System.out.print("kilometro: ");
kilometros=it.nextDouble();
System.out.print("precio: ");
costo=it.nextDouble();
//proceso
resultado=costo*kilometros;
  
//datos de salida
System.out.println("costo: "+resultado);
    
  }
  }