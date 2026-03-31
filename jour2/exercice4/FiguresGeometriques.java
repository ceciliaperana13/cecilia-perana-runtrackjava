package jour2.exercice4;

public class FiguresGeometriques {

    public static void main(String[] args) {

        // rectangle
        Rectangle rect = new Rectangle(5.0, 3.0);
        System.out.println("=== Rectangle ===");
        System.out.println("Longueur : " + rect.getLongueur());
        System.out.println("Largeur : " + rect.getLargeur());
        System.out.println("Surface : " + rect.surface());

        // cercle
        Cercle c = new Cercle(2.0, 3.0, 5.0);
        System.out.println("\n=== Cercle ===");
        c.affiche();
        System.out.println("Surface : " + c.surface());
        System.out.println("Point (1,1) intérieur ? " + c.estInterieur(1.0, 1.0));
        System.out.println("Point (10,10) intérieur ? " + c.estInterieur(10.0, 10.0));

        // colore
        RectangleColore rc = new RectangleColore(6.0, 4.0, 3);
        System.out.println("\n=== Rectangle Coloré ===");
        rc.affiche();
    }
}
