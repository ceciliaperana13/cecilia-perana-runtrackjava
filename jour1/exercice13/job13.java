package jour1.exercice13;

public class job13 {
    //l’utilisateur de saisir un nombre entier n inférieur ou égal à 9 et de lui afficher la table de multiplication 
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Veuillez saisir un nombre entier n (0-9): ");
        int n = scanner.nextInt();
        if (n < 0 || n > 9) {
            System.out.println("Veuillez saisir un nombre entier entre 0 et 9.");
        } else {
            System.out.println("Table de multiplication de " + n + ":");
            for (int i = 0; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        }
        scanner.close();
    }
}
