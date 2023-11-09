package personnages.principaux;

import interfaces.IPleutre;
import personnages.Humain;

public class Commercant extends Humain implements IPleutre {


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

    @Override
    public void fuir() {

    }
}
