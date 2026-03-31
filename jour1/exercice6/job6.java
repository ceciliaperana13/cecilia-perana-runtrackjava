package jour1.exercice6;

public class job6 {
    // nombre entier et afficher la moyenne de ces nombres.
    public static void main(String[]args){
        java.util.Scanner scanner = new java.util.Scanner (System.in);
        System.out.print("Veillez saisir le nombre entier:");
        int n =scanner .nextInt();
        int sum =0;
        for (int i=1; i<=n ; i++){
            sum += i;
        }
        System.out.print ("La moyenne de ces nombres est :" +sum/n);
    }
}
