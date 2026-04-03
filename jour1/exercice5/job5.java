package jour1.exercice5;

public class job5 {
    //qui demande à l’utilisateur de saisir successivement trois nombres et de lui afficher le maximum des deux.
    public static void main(String[] args){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Veuillez saisir le premier nombre: ");
        double num1 = scanner.nextDouble();
        System.out.print("Veuillez saisir le deuxième nombre: ");
        double num2 = scanner.nextDouble();
        System.out.print("Veuillez saisir le troisième nombre: ");
        double num3 = scanner.nextDouble();

        double max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        System.out.println("Le maximum des trois nombres est: " + max);
        scanner.close();

    }
}
