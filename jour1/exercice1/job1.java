package jour1.exercice1;

public class job1 {
    //Récupérer une saisie clavier puis afficher là.
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Veuillez saisir une valeur: ");
        String input = scanner.nextLine();
        System.out.println("Vous avez saisi: " + input);
        scanner.close();
    }
}
