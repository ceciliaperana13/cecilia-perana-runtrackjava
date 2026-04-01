package jour7.exercice2;

class Terrain extends Carte {
    char couleur;

    public Terrain(char couleur) {
        super(0);
        this.couleur = couleur;
        System.out.println("Carte Terrain créée");
    }

    public void afficher() {
        super.afficher();
        System.out.println("Couleur : " + couleur);
    }
}
