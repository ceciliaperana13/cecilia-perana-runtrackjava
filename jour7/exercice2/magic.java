package jour7.exercice2;

class Magic {
    public static void main(String[] args) {

        Jeu jeu = new Jeu();

        System.out.println("\n== Pioche ==");
        jeu.piocher(new Terrain('v'));
        jeu.piocher(new Terrain('r'));
        jeu.piocher(new Creature("Dragon", 5, 10, 7));
        jeu.piocher(new Creature("Elfe", 2, 3, 2));
        jeu.piocher(new Sortilege("Boule de feu", "Inflige 3 dégâts à une cible", 3));
        jeu.piocher(new Sortilege("Soin", "Restaure 5 points de vie", 2));

        System.out.println("\n== Affichage du jeu ==");
        jeu.afficher();

        System.out.println("\n== Jouer une carte ==");
        jeu.jouer();

        System.out.println("\n== Affichage après avoir joué ==");
        jeu.afficher();
    }
}
