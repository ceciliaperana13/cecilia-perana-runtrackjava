package jour1.exercice7;

public class job7{
    //caclcule la sommes des 100 premiers nombres entiers et affiche le résultat.
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("La somme des 100 premiers nombres entiers est: " + sum);
    }
}