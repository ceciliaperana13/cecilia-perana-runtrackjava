package jour4.exercice4_5;
//utilisateur dois saisir le nombre maximum a compter de 1 a n, le programme affiche les nombres de 1 a n
public class comptagesequentiel {
    public static void main(String[] args) {
        int n = 10 ;//nombre maximum  a compter
        for (int i=1;i<=n;i++){
            System.out.println(i);

        }
        // temps d'execution du programme
        long startTime = System.nanoTime();
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Temps d'exécution : " + duration + " nanosecondes");

        
    }
}
