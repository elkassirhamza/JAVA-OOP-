public class Compte2 extends Compte {
    String nom;
    String adresse;
    double solde;
    double calculerInterer(double tauxInteret){
        double inter;
        return inter=this.solde*tauxInteret/100;
    }

    static void afficherInfosSolde (String nom, String adresse, double solde, double inter) {
        System.out.println(nom +" habite à "+"(" + adresse+")"+"- infos solde "+ solde+" DH et solde avec interet: "+inter+" DH");

    }


}