package tp3;

import java.util.Scanner;

public class SerieHarmonique {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        System.out.print("Donner un entier n : ");
        int n = clavier.nextInt();

        if (n <= 0) {
            System.out.println("Veuillez saisir un entier positif.");
        } else {
            double somme = 0.0;

            for (int i = 1; i <= n; i++) {
                somme = somme + (1.0 / i);
            }

            System.out.println("La somme harmonique est : " + somme);
        }

        clavier.close();
    }
}