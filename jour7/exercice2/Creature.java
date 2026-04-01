package jour7.exercice2;

class Creature extends Carte {
    String nom;
    int degats;
    int vie;

    public Creature(String nom, int degats, int vie, int cout) {
        super(cout);
        this.nom = nom;
        this.degats = degats;
        this.vie = vie;
        System.out.println("Carte Créature créée");
    }

    public void afficher() {
        super.afficher();
        System.out.println("Nom : " + nom);
        System.out.println("Dégâts : " + degats);
        System.out.println("Vie : " + vie);
    }
}
