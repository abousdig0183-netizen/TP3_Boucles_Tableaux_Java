package tp3;

import java.util.Scanner;

public class FenetreGlissante {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        int MAXV = 100000;

        int n = clavier.nextInt();
        int k = clavier.nextInt();

        if (n < 1 || n > 100000 || k < 1 || k > n) {
            System.out.println("Parametres invalides.");
        } else {

            int[] T = new int[n];
            int[] freq = new int[MAXV + 1];

            for (int i = 0; i < n; i++) {
                T[i] = clavier.nextInt();
            }

            int distinct = 0;

            // Initialisation de la premiere fenetre
            for (int i = 0; i < k; i++) {

                int x = T[i];

                if (x < 0 || x > MAXV) {
                    System.out.println("Valeur invalide.");
                    clavier.close();
                    return;
                }

                freq[x]++;

                if (freq[x] == 1) {
                    distinct++;
                }
            }

            System.out.print(distinct);

            // Glissement de la fenetre
            for (int i = k; i < n; i++) {

                int out = T[i - k];
                freq[out]--;

                if (freq[out] == 0) {
                    distinct--;
                }

                int in = T[i];

                if (in < 0 || in > MAXV) {
                    System.out.println("\nValeur invalide.");
                    clavier.close();
                    return;
                }

                freq[in]++;

                if (freq[in] == 1) {
                    distinct++;
                }

                System.out.print(" " + distinct);
            }
        }

        clavier.close();
    }
}