package tp3;

import java.util.Scanner;

public class CarresImpairs {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        System.out.print("Combien de valeurs : ");
        int n = clavier.nextInt();

        int[] tableau = new int[n];

        for (int i = 0; i < n; i++) {
            int impair = 2 * i + 1;
            tableau[i] = impair * impair;
        }

        for (int i = 0; i < n; i++) {
            int impair = 2 * i + 1;
            System.out.println(impair + " a pour carre " + tableau[i]);
        }

        clavier.close();
    }
}