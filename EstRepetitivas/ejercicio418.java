package EstRepetitivas;

import java.util.Scanner;

/**
 * ejercicio418
 */
public class ejercicio418 {
    
    static Scanner lt=new Scanner(System.in);

    public static void impuestosVehiculos418() {
        String claveV, hayMas="S";
        int cantVC1=0, cantVC2=0, cantVC3=0;
        double precioVC1=0, precioVC2=0, precioVC3=0,
        impVC1=0, impVC2=0, impVC3=0, totalImpV=0;
         
        while (hayMas.equals("S")) {
            System.out.println("Ingres la clave del Vehiculo (VC1,VC2,VC3):");
            claveV=lt.next().toUpperCase();
            if (claveV.equals("VC1")) {
                System.out.println("Ingrese cantidad de Vehiculos con clave "+claveV+":");
                cantVC1=cantVC1+lt.nextInt();
                if(precioVC1==1){
                System.out.println("Ingrese el precio del Vehiculos con clave "+claveV+":");
                precioVC1=lt.nextDouble();
                }
                impVC1=precioVC1*0.10;
            }else if (claveV.equals("VC2")){
                System.out.println("Ingrese cantidad de Vehiculos con clave "+claveV+":");
                cantVC2=cantVC2+lt.nextInt();
                if(precioVC2==0){
                System.out.println("Ingrese el precio del Vehiculos con clave "+claveV+":");
                precioVC2=lt.nextDouble();
                }
                impVC2=precioVC1*0.07;
            }else if (claveV.equals("VC3")){
                System.out.println("Ingrese cantidad de Vehiculos con clave "+claveV+":");
                cantVC3=cantVC3+lt.nextInt();
                if(precioVC3==0){
                System.out.println("Ingrese el precio del Vehiculos con clave "+claveV+":");
                precioVC3=lt.nextDouble();
                }
                impVC3=precioVC1*0.05;
            }else{System.out.println("La clave de vehiculo es incorrecto");}
            System.out.println("Hay mas vehiculos?: S=SI, N=NO");
            hayMas=String.valueOf(lt.next().toUpperCase().charAt(0));
        }
        System.out.println("Impuesto de Vehiculo VC1 es: "+impVC1);
        System.out.println("Impuesto de Vehiculo VC2 es: "+impVC2);
        System.out.println("Impuesto de Vehiculo VC3 es: "+impVC3);

        System.out.println("Impuesto Total de Vehiculo VC1 es: "+(impVC1*cantVC1));
        System.out.println("Impuesto Total de Vehiculo VC2 es: "+(impVC2*cantVC2));
        System.out.println("Impuesto Total de Vehiculo VC3 es: "+(impVC3*cantVC3));

        totalImpV=(impVC1*cantVC1)+(impVC2*cantVC2)+(impVC3*cantVC3);
        System.out.println("Total impuesto a pagar de"+(cantVC1+cantVC2+cantVC3)+" es:"+totalImpV);
    }

    public static void main(String[] args) {
        impuestosVehiculos418();
    }
}