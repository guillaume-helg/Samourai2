package personnages.secondaires;

import interfaces.IPleutre;
import personnages.Humain;
import personnages.principaux.Commercant;
import personnages.principaux.Samourai;

public class Traitre extends Samourai implements IPleutre {

    private double niveauTraitrise;
    public Traitre(String nom, int argent, String boisson, String seigneur) {
        super(nom, argent, boisson, seigneur);
        this.niveauTraitrise = 0;
    }

    public void extorquer(Commercant c) {
        this.gagnerArgent(c.seFaireExtorquer());
        if (this.niveauTraitrise < 3) this.niveauTraitrise++;
    }

    public void direBonjour() {
        super.direBonjour();
        this.parler("Mon niveau de traitrise est de : " + this.niveauTraitrise);
    }

    public void faireLeGentil(int montant, Humain h) {
        this.perdreArgent(montant);
        h.gagnerArgent(montant);
        if (this.niveauTraitrise > 0) this.niveauTraitrise -= ((1/10) * montant);
        this.parler("Je fais ami - ami !");
    }

    @Override
    public void fuir() {

    }
}
