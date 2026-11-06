package tp3;

import java.util.Scanner;

public class RotationMatrice {

    public static void rotate90ClockwiseInPlace(int[][] A) {
        int n = A.length;

        // Transposition
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }

        // Renverser chaque ligne
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = A[i][j];
                A[i][j] = A[i][n - 1 - j];
                A[i][n - 1 - j] = temp;
            }
        }
    }

    public static void afficher(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Donner N : ");
        int n = clavier.nextInt();

        if (n < 2 || n > 200) {
            System.out.println("N doit etre entre 2 et 200.");
        } else {
            int[][] A = new int[n][n];

            System.out.println("Donner les elements de la matrice :");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    A[i][j] = clavier.nextInt();
                }
            }

            rotate90ClockwiseInPlace(A);

            System.out.println("Matrice apres rotation :");
            afficher(A);
        }

        clavier.close();
    }
}