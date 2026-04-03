package jour4.exercice7;
import java.util.Scanner;

//calcule la somme en parrallel de tous les nombres dans le tableau à l'aide de 2 threads et afficher la somme totale ainsi que le temps d'exécution. chaque thread doit calculer la somme de la moitié du tableau et ensuite les résultats sont additionnés pour obtenir la somme totale.
public class thread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre d'éléments du tableau : ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Entrez les éléments du tableau :");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int mid = n / 2;
        SumThread thread1 = new SumThread(numbers, 0, mid);
        SumThread thread2 = new SumThread(numbers, mid, n);
        
        // Démarrage du chronomètre
        long startTime = System.nanoTime();
        
        thread1.start();
        thread2.start();
        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        int totalSum = thread1.getSum() + thread2.getSum();
        
        // Fin du chronomètre
        long endTime  = System.nanoTime();
        long duration = endTime - startTime;
        
        System.out.println("La somme totale est : " + totalSum);
        System.out.println("Temps d'exécution : " + duration + " nanosecondes");
    }
    
}
