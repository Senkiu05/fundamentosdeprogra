package p1;

import java.util.Scanner;

public class ifSencillo {
    public static void main(String[] args) {

        Scanner teclado= new Scanner(System.in);
        System.out.println("\n cuantos corazones tienes: ");
        int corazones= teclado.nextInt();
        if(corazones == 1){
            System.out.println("\n completo");
        }else{
            System.out.println("\n ella no te ama");
        }
    }
}
