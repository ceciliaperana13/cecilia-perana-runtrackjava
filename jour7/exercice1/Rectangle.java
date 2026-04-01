package jour7.exercice1;

class Rectangle {
    double largeur;
    double hauteur;

    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public String toString() {
        return "Rectangle [largeur=" + largeur + ", hauteur=" + hauteur + "]";
    }

    public boolean equals(Rectangle other) {
        if (other == null) return false;
        return this.largeur == other.largeur && this.hauteur == other.hauteur;
    }
}