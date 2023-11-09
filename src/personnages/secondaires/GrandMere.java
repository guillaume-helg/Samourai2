package personnages.secondaires;

import personnages.Humain;
import personnages.Personnages;

import java.util.Random;

public class GrandMere extends Humain {
    private Humain[] memoire = new Humain[30];
    private Random r = new Random();

    private Personnages[] perso = Personnages.values();

    public GrandMere(String nom, int argent) {
        super(nom, argent, "tisane");
    }

    private Personnages humainHasard() {
        return perso[r.nextInt(perso.length)];
    }

    public void ragoter() {
        this.parler("je crois que XXX est un Ronin\" ou \"je sais que YYY est un traître !");
    }

    public void faireConnaissanceAvec(Humain h) {
        int i = 0;
        while(this.memoire[i] != null) i++;
        if (i < 30) this.memoire[i] = h;
    }
}
