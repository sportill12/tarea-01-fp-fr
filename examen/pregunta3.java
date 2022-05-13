package examen;

import java.util.Scanner;

public class pregunta3 {

    static Scanner lt=new Scanner(System.in);

    public static void pregunta3examenFRFM() {

        int v1, v2;
        double R;

        System.out.print("ingrese el primer valor: ");
        v1 = lt.nextInt();
        System.out.print("ingrese el segundo valor: ");
        v2 = lt.nextInt();
        char operador=lt.next().charAt(0);
        R = Math.sqrt(v1);
    
        switch (operador){
            
            case '+': System.out.println(v1+v2); break;
            case '-': System.out.println(v1-v2); break;
            case '/': System.out.println(v1/v2); break;
            case 'x': System.out.println(v1*v2); break;
            case '%': System.out.println(v1%2); break;
            case '^': System.out.println(v1^v2); break;
            case 'R': System.out.println(+R); break;
            
            default: break;
        }
        
    }

    public static void main(String[] args) {

        pregunta3examenFRFM();
        
    }
    
}
