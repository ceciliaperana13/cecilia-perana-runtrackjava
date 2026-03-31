package jour2.exercice4;

class Cercle extends Figure {

    protected double rayon;

    // Constructeur : centre (x, y) + rayon
    public Cercle(double x, double y, double rayon) {
        super(x, y); // 👈 appelle le constructeur de Figure
        this.rayon = rayon;
    }

    @Override
    public void affiche() {
        super.affiche(); // 👈 affiche le centre (méthode de Figure)
        System.out.println("Rayon : " + rayon);
    }

    public double surface() { return Math.PI * rayon * rayon; }

    public boolean estInterieur(double px, double py) {
        double distance = Math.sqrt(Math.pow(px - x, 2) + Math.pow(py - y, 2));
        return distance < rayon;
    }

    public double getRayon() { return rayon; }
    public void setRayon(double rayon) { this.rayon = rayon; }
    public void setCentre(double x, double y) { this.x = x; this.y = y; }
}