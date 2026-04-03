package jour2.exercice1; 

public class Personne {

    public String nom;
    public String prenom;
    protected String dateDeNaissance;
    protected String lieuDeNaissance;
    private String adresse;
    private String telephone;

    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }
    public String getTelephone() { return telephone; }
    public void setTelephone(String telephone) { this.telephone = telephone; }
}
//Pourquoi private + getters/setters plutôt que public ?
///C'est le principe d'encapsulation : on protège les données sensibles (téléphone, adresse) et on contrôle comment elles sont lues ou modifiées.
/// Pour quels types a-t-on besoin de getters/setters ?
///Uniquement pour les attributs private, car ils sont inaccessibles de l'extérieur.