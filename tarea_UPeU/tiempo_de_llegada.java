import java.util.Scanner;

public class tarea {
  public static void main(String[] args){
        //definir variables
 double tiempo, distancia, velocidad;
  //datos de entrada
  Scanner it=new Scanner(System.in);
  System.out.print("distancia: ");
distancia=it.nextDouble();
System.out.print("velociadad: ");
velocidad=it.nextDouble();
//proceso
tiempo=distancia/velocidad;
  
//datos de salida
System.out.println("tempo de llegada: "+tiempo);
    
  }
  }