import java.util.Scanner;

/**
 * ejercicios
 */
public class ejercicios {

    public static void mostrarcursosdeldia() {
        //Definir variable
        int diaSem;
        String mensaje;
        String primeraParteM="Ese dia toca el curso de: ";
        //Leer datos
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese un dia de la semana :\n1=Dom"+"\n2=Lun\n3=Mar\n4=Mie\n5=Jue\n6=Vie\n7=Sab");
        diaSem=lt.nextInt();
        //Proceso
        if (diaSem==1 || diaSem==7) {
            mensaje=primeraParteM+"No hay clases";
        }else if(diaSem==2){
            mensaje=primeraParteM+"matematica";
        }else if(diaSem==3 || diaSem==5){
            mensaje=primeraParteM+"fundamentos de programacion";
        }else if(diaSem==4){
            mensaje=primeraParteM+"capacidades comunicativas";
        }else if(diaSem==6){
            mensaje=primeraParteM+"introduccion a la ingenieria de sistemas";
        }else{
            mensaje=primeraParteM+"el dia no existe";
        }
        //Datos de salida
        System.out.println(mensaje);
    }

    public static void main(String[] args) {
        mostrarcursosdeldia();

    }
}