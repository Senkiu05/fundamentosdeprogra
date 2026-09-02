package p1;

import java.util.Scanner;

public class ifSencillo {
    public static void main(String[] args) {

        Scanner teclado= new Scanner(System.in);
        System.out.println("\n cuantas novias tienes: ");
        int corazones= teclado.nextInt();
        if(corazones == 1){
            System.out.println("\n te engaña");
        }else{
            System.out.println("\n ellas no te aman");
        }
    }
}
