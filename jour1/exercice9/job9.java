package jour1.exercice9;

public class job9 {
    //l'utilisateur de saisir son âge et de lui afficher qu'il est mineur si son âge est inférieur à 18 ans et qu'il est majeurdans le cas contraire.
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Veuillez saisir votre âge: ");
        int age = scanner.nextInt();
        if (age < 18) {
            System.out.println("Vous êtes mineur.");
        } else {
            System.out.println("Vous êtes majeur.");
        }
        scanner.close();
    }
}
