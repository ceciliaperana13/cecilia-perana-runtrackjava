package jour2.exercice4;

public class FiguresGeometriques {

    public static void main(String[] args) {

        // ---- RECTANGLE ----
        Rectangle rect = new Rectangle(1.0, 2.0, 5.0, 3.0);
        System.out.println("=== Rectangle ===");
        rect.affiche();
        System.out.println("Surface : " + rect.surface());

        // ---- CERCLE ----
        Cercle c = new Cercle(2.0, 3.0, 5.0);
        System.out.println("\n=== Cercle ===");
        c.affiche();
        System.out.println("Surface : " + c.surface());
        System.out.println("Point (1,1) intérieur ? " + c.estInterieur(1.0, 1.0));
        System.out.println("Point (10,10) intérieur ? " + c.estInterieur(10.0, 10.0));

        // ---- RECTANGLE COLORÉ ----
        RectangleColore rc = new RectangleColore(1.0, 2.0, 6.0, 4.0, 3);
        System.out.println("\n=== Rectangle Coloré ===");
        rc.affiche();
        System.out.println("Surface : " + rc.surface());
    }
}
