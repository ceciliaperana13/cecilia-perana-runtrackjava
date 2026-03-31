package jour2.exercice4;

class Cercle {

    // Attributs PROTÉGÉS (# dans le diagramme UML)
    protected double x;
    protected double y;
    protected double rayon;

    // Constructeur
    public Cercle(double x, double y, double rayon) {
        this.x = x;
        this.y = y;
        this.rayon = rayon;
    }

    // Affiche les infos du cercle
    public void affiche() {
        System.out.println("Centre : (" + x + ", " + y + ") | Rayon : " + rayon);
    }

    // Calcule la surface : π × r²
    public double surface() {
        return Math.PI * rayon * rayon;
    }

    // Vérifie si un point (px, py) est à l'intérieur du cercle
    // Formule : distance du point au centre < rayon
    public boolean estInterieur(double px, double py) {
        double distance = Math.sqrt(Math.pow(px - x, 2) + Math.pow(py - y, 2));
        return distance < rayon;
    }

    // Getters
    public double getX() { return x; }
    public double getY() { return y; }
    public double getRayon() { return rayon; }

    // Setters
    public void setCentre(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void setRayon(double rayon) { this.rayon = rayon; }
}