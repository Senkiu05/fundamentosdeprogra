package p1;

import java.util.Scanner;

public class entrada {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println(" Cual es el nombre del producto: ");
        String nombre = teclado.nextLine();

        System.out.println("\n El nombre del producto es: " +  nombre);

        System.out.println("\n cuantos productos caben en cada tarima:  ");
        int numeroDeProducos = teclado.nextInt();

        System.out.println("\n la cantidad de productos que caben en cada tarima es  " + numeroDeProducos);

        System.out.println("\n cuantos productos sobraron: ");
        int sobrante = teclado.nextInt();

        System.out.println("\n el producto sobrante es: " + sobrante);

        System.out.print("\n Inventario: " + "\n Nombre: "+ nombre +  "\n Numero De Productos: "+ numeroDeProducos +"\n Numero De Productos Sobrante: "+ sobrante);


    }
}
