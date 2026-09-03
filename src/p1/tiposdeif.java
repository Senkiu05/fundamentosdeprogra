package p1;

import java.util.Scanner;

public class tiposdeif {
    public static void main(String[] args) {

        Scanner leer1= new Scanner(System.in);
        System.out.println("\n 1 Debito \n 2 Credito \n 3 Efectivo  ");
        int opcion= leer1.nextInt();
        if(opcion == 1){
        System.out.println("guarda dinero y transferencia");
        System.out.println("Clonar Tarjeta");
        System.out.println("vaciar dinero");
        System.out.println("robo de identidad");
        System.out.println("no generas historial crediticio");
        } else if (opcion==2) {
            System.out.println("historial crediticio");
            System.out.println("puntos");
            System.out.println("cashback");
            System.out.println("viajes");
            
        } else if (opcion==3) {
            System.out.println("descapitalizacion");
            
            
        } else if (opcion > 3) {
            System.out.println("invalido");

            
        }
    }
}
