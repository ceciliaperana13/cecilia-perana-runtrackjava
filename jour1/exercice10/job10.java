package jour1.exercice10;

public class job10 {
    //calcule la factorielle de 8.
    public static void main(String[] args) {
        int n = 8;
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("La factorielle de " + n + " est: " + factorial);
    }

}
