package jour2.exercice1;


public class Main {
    public static void main(String[] args) {

        Personne p = new Personne();

        // Attributs publics → accès direct 
        p.nom = "Dupont";
        p.prenom = "Marie";

        // Attributs protégés → accès direct dans le même package 
        p.dateDeNaissance = "01/01/2000";
        p.lieuDeNaissance = "Paris";

        // Attributs privés → IMPOSSIBLE d'y accéder directement 
        // p.adresse = "10 rue de la Paix"; ← ERREUR de compilation !

        // On passe obligatoirement par les setters ✅
        p.setAdresse("10 rue de la Paix");
        p.setTelephone("0612345678");

        System.out.println(p.prenom + " " + p.nom);
        System.out.println("Adresse : " + p.getAdresse());
        System.out.println("Téléphone : " + p.getTelephone());
    }
}