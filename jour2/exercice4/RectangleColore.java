package jour2.exercice4;

class RectangleColore extends Rectangle {

    // Attribut supplémentaire,protected pour être accessible dans la classe fille
    protected int couleur;

    // Constructeur : on reprend longueur et largeur du parent + on ajoute couleur
    public RectangleColore(double longueur, double largeur, int couleur) {
        super(longueur, largeur); //  appelle le constructeur de Rectangle
        this.couleur = couleur;
    }

    // Getter et Setter
    public int getCouleur() { return couleur; }
    public void setCouleur(int couleur) { this.couleur = couleur; }

    // Affichage
    public void affiche() {
        System.out.println("Longueur : " + longueur);
        System.out.println("Largeur : " + largeur);
        System.out.println("Couleur : " + couleur);
        System.out.println("Surface : " + surface());
    }
}