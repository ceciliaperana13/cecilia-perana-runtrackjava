package jour2.exercice4;

class Figure {

    protected double x;
    protected double y;

    // Constructeur
    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Affiche les coordonnées du centre
    public void affiche() {
        System.out.println("Centre : (" + x + ", " + y + ")");
    }

    // Getters & Setters
    public double getX() { return x; }
    public double getY() { return y; }
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
}
