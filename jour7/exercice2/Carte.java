package jour7.exercice2;

// Classe mère abstraite
abstract class Carte {
    int cout;

    public Carte(int cout) {
        this.cout = cout;
    }

    public void afficher() {
        System.out.println("Coût : " + cout);
    }
}
