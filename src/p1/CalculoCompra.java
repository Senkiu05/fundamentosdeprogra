package p1;
import java.util.Scanner;
public class CalculoCompra {
    public static void main(String[] args) {

                Scanner teclado = new Scanner(System.in);
                System.out.print("¿Ella te ama? (1 = Si, 2 = No): ");
                int respuesta = teclado.nextInt();

                if (respuesta == 1) {
                    System.out.println("te engaña brother");
                } else {
                    System.out.println("mandala alv mi compa");
                }


        System.exit(0);
        String producto = "Audífonos Gamer";
        double precio = 500.00;
        int cantidad = 2;
        final double DESCUENTO = 0.15;
        double subtotal = precio * cantidad;
        double cantidadDescontada = subtotal * DESCUENTO;
        double precioFinal = subtotal - cantidadDescontada;

        System.out.println("Producto: " + producto);
        System.out.println("Precio por unidad: $" + precio);
        System.out.println("Cantidad comprada: " + cantidad);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento aplicado: $" + cantidadDescontada);
        System.out.println("Precio final: $" + precioFinal);
    }
}