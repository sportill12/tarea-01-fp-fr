package tar04;

import java.util.Scanner;

/**
 * ejer4
 */
public class ejer4 {

    static Scanner lt=new Scanner(System.in);
      
        int i, n;
        double enero, febrero, marzo, abril, mayo;
        double junio, julio, agosto, septiembre, octubre;
        double noviembre, diciembre, intereses, inversion_final, total;
        total = 0;
        System.out.print(" Ingrese los años que invirtio: ");
        n = lt.nextInt();
        for (i=1; i<=n; i++) {
            System.out.print(+ i);
            System.out.print(" Ingresa el valor de cantidad enero: ");
            enero = lt.nextDouble();
            System.out.print(" Ingresa el valor de cantidad febrero: ");
            febrero = lt.nextDouble();
            System.out.print(" Ingresa el valor de cantidad marzo: ");
            marzo = lt.nextDouble();
            System.out.print(" Ingresa el valor de cantidad abril: ");
            abril = lt.nextDouble();
            System.out.print(" Ingresa el valor de cantidad mayo: ");
            mayo = lt.nextDouble();
            System.out.print(" Ingresa el valor de cantidad junio: ");
            junio = lt.nextDouble();
            System.out.print(" Ingresa el valor de cantidad julio: ");
            julio = lt.nextDouble();
            System.out.print(" Ingresa el valor de cantidad agosto: ");
            agosto = lt.nextDouble();
            System.out.print(" Ingresa el valor de cantidad septiembre: ");
            septiembre = lt.nextDouble();
            System.out.print(" Ingresa el valor de cantidad octubre: ");
            octubre = lt.nextDouble();
            System.out.print(" Ingresa el valor de cantidad noviembre: ");
            noviembre = lt.nextDouble();
            System.out.print(" Ingresa el valor de cantidad diciembre: ");
            diciembre = lt.nextDouble();
            intereses=total*0.1;
            total=total+intereses+enero+febrero+marzo+abril+mayo+junio+julio+agosto+septiembre+octubre+noviembre+diciembre;
            inversion_final=total;
            System.out.println("intereses: " + intereses);
            System.out.println("inversion final: " + inversion_final);
            System.out.println();
        }
        System.out.println("Inversion total: " + total);
}
 }