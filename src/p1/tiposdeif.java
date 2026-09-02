package p1;

import java.util.Scanner;

public class tiposdeif {
    public static void main(String[] args) {

        Scanner leer= new Scanner(System.in);
        System.out.println("\n cuanto dinero quieres retirar:  ");
        double dinero= 4000.00;
        double retiro = leer.nextDouble();
        if(dinero <= retiro && retiro > 0){
            dinero= dinero -retiro;

            System.out.println("saldo actual: "+ dinero);

        }else{
            System.out.println("\n pobre diablo no se puede :(");
        }



        System.exit(0);
        Scanner teclado= new Scanner(System.in);
        System.out.println("\n cuantas novias tienes: ");
        int corazones= teclado.nextInt();
        if(corazones == 1){
            System.out.println("\n te engaña");

        }
    }
}
