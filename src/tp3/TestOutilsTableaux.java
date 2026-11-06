package tp3;

public class TestOutilsTableaux {

    public static void main(String[] args) {

        double[][] t1 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        double[][] t2 = {
            {10, 20, 30},
            {40, 50, 60}
        };

        System.out.println("Tableau t1 :");
        OutilsTableaux.affiche(t1);

        System.out.println("\nTableau regulier : "
                + OutilsTableaux.regulier(t1));

        System.out.println("\nSomme des lignes :");
        double[] sommes = OutilsTableaux.sommeLignes(t1);

        for (double valeur : sommes) {
            System.out.println(valeur);
        }

        System.out.println("\nSomme des deux tableaux :");
        double[][] resultat = OutilsTableaux.somme(t1, t2);
        OutilsTableaux.affiche(resultat);
    }
}