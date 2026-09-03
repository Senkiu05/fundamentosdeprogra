package p1;

import java.util.Scanner;

public class ifanidado {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);

        String tipo = "Asalariado";
        int ganas = 400000;
        int cantidadDeTrabajos = 2;
        if(tipo.equals("Asalariado")){
            System.out.println("patron");

            if(ganas>= 400000 ||cantidadDeTrabajos>= 2  ){

            }
        }else{
            System.out.println("obligaciones");
            System.out.println("declaracion anual");
            System.out.println("declaracion mensual");

        }
    }
}
