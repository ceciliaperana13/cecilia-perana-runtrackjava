package jour1.exercice12;

public class job12 {
    //l’utilisateur de saisir un nombre entier n et de lui afficher successivement tous les nombres pairs 
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Veuillez saisir un nombre entier n: ");
        int n = scanner.nextInt();
        System.out.println("Les nombres pairs inférieurs ou égaux à " + n + " sont:");
        for (int i = 0; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
