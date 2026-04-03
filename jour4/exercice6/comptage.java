package jour4.exercice6;
import java.util.Scanner;

//Le programme doit ensuite calculer la somme de tous les nombres dans le tableau et afficher le résultat ainsi que le temps d'exécution du programme.

public class comptage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre d'éléments du tableau : ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Entrez les éléments du tableau :");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int sum = 0;

        // Démarrage du chronomètre
        long startTime = System.nanoTime();

        // Calcul de la somme des nombres dans le tableau
        for (int number : numbers) {
            sum += number;
        }

        // Fin du chronomètre
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        // Affichage de la somme totale et du temps d'exécution
        System.out.println("La somme totale est : " + sum);
        System.out.println("Temps d'exécution : " + duration + " nanosecondes");
    }
    
}
