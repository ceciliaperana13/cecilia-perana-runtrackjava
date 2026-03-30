package jour1.exercice3;

public class job3 {
    //Écrire un programme java qui crée un tableau de 10 entiers qui stocke dans l’ordre les entiers de 0 à 9. Combien vaut T[0], T[1], T[5], T[9], T[10] ?
    public static void main(String[] args) {
        int[] T = new int[10];
        for (int i = 0; i < 10; i++) {
            T[i] = i;
        }
        System.out.println("T[0] = " + T[0]);
        System.out.println("T[1] = " + T[1]);
        System.out.println("T[5] = " + T[5]);
        System.out.println("T[9] = " + T[9]);
        // T[10] est en dehors des limites du tableau, donc cela provoquerait une erreur
    }
}
