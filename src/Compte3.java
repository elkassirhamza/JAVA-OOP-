public class Compte3 extends Compte2 {

    public String getNom() {
        return this.nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getAdresse() {
        return this.adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public double getSolde() {
        return this.solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Compte3(String nom, String adresse, double solde) {
        this.nom = nom;
        this.adresse = adresse;
        this.solde = solde;
    }

    public void retirer(double m) {
        if (m > this.solde) {
            System.out.println("Solde insuffisant");
        }else {
            this.solde =solde - m;
            System.out.println("vous avez retire : " +m+ " MAD");
            System.out.println("votre solde actuel est de "+ solde +" MAD");
        }
    }

}
