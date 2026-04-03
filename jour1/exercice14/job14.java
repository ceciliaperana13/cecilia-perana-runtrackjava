package jour1.exercice14;

public class job14 {
    //écrire un programme qui demande un nombre et qui affiche son inverse.
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Veuillez saisir un nombre: ");
        String number = scanner.nextLine();
        String reversedNumber = new StringBuilder(number).reverse().toString();
        System.out.println("Le nombre inversé est: " + reversedNumber);
        scanner.close();
    }
}
