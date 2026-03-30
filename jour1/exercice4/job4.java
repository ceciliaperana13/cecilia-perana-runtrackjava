package jour1.exercice4;

public class job4 {
    //programme qui te demande de saisir un nombre et d'afficher son carré
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Veuillez saisir un nombre: ");
        double number = scanner.nextDouble();
        double square = number * number;
        System.out.println("Le carré de " + number + " est: " + square);
        scanner.close();
    }
    
}
