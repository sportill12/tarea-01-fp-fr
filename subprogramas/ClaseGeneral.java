package subprogramas;

import java.util.Scanner;

/**
 * ClaseGeneral
 */
public class ClaseGeneral {

    static Scanner lt=new Scanner(System.in);
    static aritmetica obj=new aritmetica();
    static Persona objP=new Persona();

    public static void main(String[] args) {
        /*System.out.println("Ingrese el Primer Valor:");
        int aX=lt.nextInt();
        System.out.println("Ingrese el Segundo Valor:");
        int bX=lt.nextInt();
        int result=obj.sumar(aX, bX);
        System.out.println("La Suma es:"+result);*/

        System.out.println("Ingrese una comida:");
        objP.comer(lt.next());
    }
}
