package jour7.exercice1;

class RectangleColore extends Rectangle {
    String couleur;

    public RectangleColore(double largeur, double hauteur, String couleur) {
        super(largeur, hauteur);
        this.couleur = couleur;
    }

    public String toString() {
        return "Rectangle :\n largeur = " + largeur + "\n hauteur = " + hauteur + "\n couleur = " + couleur;
    }

    public boolean equals(RectangleColore other) {
        if (other == null) return false;
        return this.largeur == other.largeur
            && this.hauteur == other.hauteur
            && this.couleur.equals(other.couleur);
    }
}