package jour2.exercice5;

class Vehicule {

    // Attributs
    protected String marque;
    protected String dateAchat;
    protected double prixAchat;
    protected double prixCourant; // sera calculé plus tard

    // Constructeur
    public Vehicule(String marque, String dateAchat, double prixAchat) {
        this.marque = marque;
        this.dateAchat = dateAchat;
        this.prixAchat = prixAchat;
        this.prixCourant = 0.0; // non connu pour l'instant
    }

    // Méthode affiche
    public void affiche() {
        System.out.println("=== Véhicule ===");
        System.out.println("Marque       : " + marque);
        System.out.println("Date d'achat : " + dateAchat);
        System.out.println("Prix d'achat : " + prixAchat + " €");
        System.out.println("Prix courant : " + prixCourant + " €");
    }

    // Getters & Setters
    public String getMarque() { return marque; }
    public void setMarque(String marque) { this.marque = marque; }

    public String getDateAchat() { return dateAchat; }
    public void setDateAchat(String dateAchat) { this.dateAchat = dateAchat; }

    public double getPrixAchat() { return prixAchat; }
    public void setPrixAchat(double prixAchat) { this.prixAchat = prixAchat; }

    public double getPrixCourant() { return prixCourant; }
    public void setPrixCourant(double prixCourant) { this.prixCourant = prixCourant; }
}
