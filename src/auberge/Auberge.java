package auberge;

import personnages.Humain;

public class Auberge {

    private Humain[] visiteur;
    private String nom;

    public Auberge(String nom, int capacite) {
        this.nom = nom;
        visiteur = new Humain[capacite];
    }

    public void nouvelArrivant(Humain h) {
        for (int i = 0; i < visiteur.length; i++) {
            if (visiteur[i] == null) {
                visiteur[i] = h;
            }
        }
    }

    public void payerLaTournee(Humain h) {
        int i;
        for (i = 0; i < visiteur.length && visiteur[i]!= null; i++) {

        }
        h.perdreArgent(i*50);
    }

    public void fight() {

    }
}
