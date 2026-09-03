package p1;

import java.util.Scanner;

public class ifanidado {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);

        System.out.println("cuanto ganas: ");
        String tipo = "Asalariado";
        int ganas = leer.nextInt();
        System.out.println("cuantos trabajos tienes: ");
        int cantidadDeTrabajos = leer.nextInt();
        if(tipo.equals("Asalariado")){
            System.out.println("patron");

            if(ganas>= 400000 || cantidadDeTrabajos>= 2  ){

            }
        }else{
            System.out.println("obligaciones");
            System.out.println("declaracion anual");
            System.out.println("declaracion mensual");

        }
    }
}
