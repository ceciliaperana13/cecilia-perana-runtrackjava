package jour1.exercice8;

public class job8 {
    //à l'utilisateur de saisir un nombre entier n et lui affiche la somme des n premiers cubes.
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Veuillez saisir un nombre entier n: ");
        int n = scanner.nextInt();
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (long) i * i * i;
        }
        System.out.println("La somme des " + n + " premiers cubes est: " + sum);
        scanner.close();
    }
}
