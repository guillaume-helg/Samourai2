package personnages.secondaires;

import personnages.principaux.Commercant;
import personnages.principaux.Yakuza;

import java.util.Random;

public class Ninja extends Yakuza {
    private static final String[] clansNinja =
            {"of Shadows", "of Mist", "of Clouds", "of Fog", "of Darkness"};

    private Random r = new Random();

    private String clanSecret;
    public Ninja(String nom, int argent, String boisson, String clan) {
        super(nom, argent, boisson, clan);
        this.clanSecret = clansNinja[r.nextInt(clansNinja.length)];
    }

    public void extorquer(Commercant c) {
        while(c.getArgent() != 0) {
            this.gagnerArgent(c.seFaireExtorquer());
            this.parler("Je viens d'extorquer " + c.getNom() + " et de gagner " + this.getArgent());
        }
    }
}
