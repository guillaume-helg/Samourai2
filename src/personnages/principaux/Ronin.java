package personnages.principaux;

import personnages.Humain;

public class Ronin extends Humain {
    private int honneur;

    public Ronin(String nom, int argent, String boisson) {
        super(nom, argent, boisson);
        this.honneur = 1;
    }

    public void donner(int n, Commercant c) {
        c.gagnerArgent(n);
        this.perdreArgent(n);
    }

    public void provoquer(Yakuza y) {
        if(this.honneur * 2 > y.getReputation()) {
            this.gagnerArgent(y.getArgent());
            y.perdreArgent(y.getArgent());
            this.honneur++;
            this.parler("Victoire !");
            y.perdreDuel();
        } else {
            this.honneur--;
            this.parler("Defaite !");
            y.gagnerDuel();
        }
    }
}
