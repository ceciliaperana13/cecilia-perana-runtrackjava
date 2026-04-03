package jour2.exercice4;

class RectangleColore extends Rectangle {

    protected int couleur;

    // Constructeur : centre (x, y) + dimensions + couleur
    public RectangleColore(double x, double y, double longueur, double largeur, int couleur) {
        super(x, y, longueur, largeur); // appelle le constructeur de Rectangle
        this.couleur = couleur;
    }

    @Override
    public void affiche() {
        super.affiche(); //  affiche centre + dimensions
        System.out.println("Couleur : " + couleur);
    }

    public int getCouleur() { return couleur; }
    public void setCouleur(int couleur) { this.couleur = couleur; }
}