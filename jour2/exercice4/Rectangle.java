package jour2.exercice4;

class Rectangle {

    // Attributs PROTÉGÉS (# dans le diagramme UML)
    protected double largeur;
    protected double longueur;

    // Constructeur
    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    // Méthode surface
    public double surface() {
        return longueur * largeur;
    }

    // Getters
    public double getLongueur() {
        return longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    // Setters
    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }
}