package jour2.exercice4;

class Rectangle extends Figure {

    protected double largeur;
    protected double longueur;

    // Constructeur : centre (x, y) + dimensions
    public Rectangle(double x, double y, double longueur, double largeur) {
        super(x, y); // 👈 appelle le constructeur de Figure
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public void affiche() {
        super.affiche(); // 👈 affiche le centre (méthode de Figure)
        System.out.println("Longueur : " + longueur + " | Largeur : " + largeur);
    }

    public double surface() { return longueur * largeur; }

    public double getLongueur() { return longueur; }
    public double getLargeur() { return largeur; }
    public void setLongueur(double longueur) { this.longueur = longueur; }
    public void setLargeur(double largeur) { this.largeur = largeur; }
}