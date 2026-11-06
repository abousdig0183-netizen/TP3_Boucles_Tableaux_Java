package tp3;

import java.util.Scanner;

public class TriangleEtoiles {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        System.out.print("Donner la hauteur du triangle : ");
        int n = clavier.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        clavier.close();
    }
}