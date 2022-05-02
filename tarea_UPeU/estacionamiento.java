port java.util.Scanner;

public class tarea {
  public static void main(String[] args){
        //definir variables
 double precio, hora, precior;
  //datos de entrada
  Scanner it=new Scanner(System.in);
  System.out.print("precio por hora: ");
precio=it.nextDouble();
System.out.print("cantidad de horas: ");
hora=it.nextDouble();
//proceso
precior=precio*hora;
  
//datos de salida
System.out.println("precio: "+precior);
    
  }
  }