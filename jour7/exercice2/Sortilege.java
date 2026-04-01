package jour7.exercice2;

class Sortilege extends Carte {
    String nom;
    String explication;

    public Sortilege(String nom, String explication, int cout) {
        super(cout);
        this.nom = nom;
        this.explication = explication;
        System.out.println("Carte Sortilège créée");
    }

    public void afficher() {
        super.afficher();
        System.out.println("Nom : " + nom);
        System.out.println("Explication : " + explication);
    }
}