package jour7.exercice2;

class Jeu {
    Carte[] cartes = new Carte[10];
    int nbCartes = 0;
    int indexJeu = 0;

    public void piocher(Carte c) {
        if (nbCartes < 10) {
            cartes[nbCartes] = c;
            nbCartes++;
        } else {
            System.out.println("Le jeu est plein !");
        }
    }

    public void jouer() {
        if (indexJeu < nbCartes && cartes[indexJeu] != null) {
            System.out.println("--- Carte jouée ---");
            cartes[indexJeu].afficher();
            cartes[indexJeu] = null;
            indexJeu++;
        } else {
            System.out.println("Aucune carte à jouer !");
        }
    }

    public void afficher() {
        System.out.println("=== Jeu de cartes ===");
        for (int i = 0; i < nbCartes; i++) {
            if (cartes[i] != null) {
                System.out.println("--- Carte " + (i+1) + " ---");
                cartes[i].afficher();
            } else {
                System.out.println("--- Carte " + (i+1) + " : déjà jouée ---");
            }
        }
    }
}