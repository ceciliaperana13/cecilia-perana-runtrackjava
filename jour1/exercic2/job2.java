package jour1.exercic2;

public class job2 {
    //Écrire un programme java qui demande un prénom et qui répond « bonjour + prénom ».
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Veuillez saisir votre prénom: ");
        String prenom = scanner.nextLine();
        System.out.println("Bonjour " + prenom + "!");
        scanner.close();
    }
}
