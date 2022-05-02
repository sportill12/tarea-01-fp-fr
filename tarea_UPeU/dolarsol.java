import java.util.Scanner;

public class tarea {
  public static void main(String[] args){
        //definir variables
 double soles, dolares, compra;
  //datos de entrada
  Scanner it=new Scanner(System.in);
  System.out.print("soles : ");
soles=it.nextDouble();
System.out.print("costo del dolar: ");
dolares=it.nextDouble();
//proceso
compra=soles*dolares;
  
//datos de salida
System.out.println("dales comprados: "+compra);
    
  }
  }