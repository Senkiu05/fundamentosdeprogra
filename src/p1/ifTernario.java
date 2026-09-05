package p1;

import java.util.Scanner;

public class ifTernario {
    public static void main(String[] args) {

        System.out.println("Dame tu password");
        Scanner leer1= new Scanner(System.in);
        String password = leer1.nextLine();
        String buena_contrasena = password.length() >= 8 ? "Buena contraseña": "mala contraseña";

        System.out.println(buena_contrasena);




        System.exit(0);
        Scanner leer= new Scanner(System.in);
        System.out.println("que quieres ver: ");
        String tipo = leer.nextLine();
        String serie = (tipo.equals("anime"))? "Los 7 pecados capitales": "Supernatural";
        System.out.println(serie);
    }
}
