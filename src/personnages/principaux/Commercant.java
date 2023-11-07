package personnages.principaux;

import personnages.Humain;

public class Commercant extends Humain {


    public Commercant(String nom, int argent) {
        super(nom, argent, "thé");
    }

    public int seFaireExtorquer() {
        int monnaie = this.getArgent();
        this.perdreArgent(monnaie);
        return monnaie;
    }

    public void recevoir(int argent) {
        this.gagnerArgent(argent);
    }
}
