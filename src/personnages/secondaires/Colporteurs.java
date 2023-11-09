package personnages.secondaires;

import personnages.principaux.Commercant;

public class Colporteurs extends Commercant {
    public Colporteurs(String nom, int argent) {
        super(nom, argent);
    }

    public int seFaireExtorquer() {
        int monnaie = this.getArgent()/2;
        this.perdreArgent(monnaie);
        this.parler("Gros nul, t'as que la moitié de mon argent !");
        return monnaie;
    }
}
