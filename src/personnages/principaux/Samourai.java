package personnages.principaux;

import interfaces.IGuerrier;
import personnages.Humain;

public class Samourai extends Ronin implements IGuerrier {

    private String seigneur;
    public Samourai(String nom, int argent, String boisson, String seigneur) {
        super(nom, argent, boisson);
        this.seigneur = seigneur;
    }

    public void direBonjour() {
        super.direBonjour();
        this.parler("Je sers " + this.seigneur);
    }

    public void boire(String boisson) {
        this.parler("Mmmm, un bon verre de " + this.getBoisson() + "! GLOUPS !");
    }

    /**
     * @param h : Adversaire du samourai
     */
    @Override
    public void combattre(Humain h) {

    }
}
