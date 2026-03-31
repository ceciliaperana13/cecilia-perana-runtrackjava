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