package personnages.principaux;
import interfaces.IGuerrier;
import personnages.Humain;

public class Yakuza extends Humain implements IGuerrier {
    private String clan;
    private int reputation;

    public Yakuza(String nom, int argent, String boisson, String clan) {
        super(nom, argent, boisson);
        this.clan = clan;
        this.reputation = 0;
    }

    public String getClan() {
        return clan;
    }

    public int getReputation() {
        return reputation;
    }

    public void extorquer(Commercant c) {
        this.gagnerArgent(c.seFaireExtorquer());
        this.reputation++;
        this.parler("Je viens d'extorquer " + c.getNom() + " et de gagner " + this.getArgent());
    }
    public void gagnerDuel() {
        this.gagnerArgent(this.getArgent());
        this.reputation++;
        this.parler("J'ai gagné");
    }

    public void perdreDuel() {
        this.perdreArgent(this.getArgent());
        this.reputation--;
        this.parler("J'ai perdu");
    }
    @Override
    public void direBonjour() {
        super.direBonjour();
        this.parler("Mon clan " + this.clan);
    }

    @Override
    public void combattre(Humain h) {

    }
}
