package personnages;

public abstract class Humain {
    private String nom;
    private int argent;
    private String boisson;

    public Humain(String nom, int argent, String boisson) {
        this.nom = nom;
        this.argent = argent;
        this.boisson = boisson;
    }

    protected void parler(String texte) {
        System.out.println(this.nom + " - " + texte);
    }

    public void direBonjour() {
        this.parler("Bonjour je m'appelle " + this.nom + " et j'ai boire du " + this.boisson);
    }

    public void boire() {
        this.parler("Mmmm, un bon verre de " + this.boisson + "! GLOUPS !");
    }

    public String getNom() {
        return nom;
    }

    public int getArgent() {
        return this.argent;
    }

    public String getBoisson() {
        return boisson;
    }

    public void gagnerArgent(int n) {
        this.argent += n;
    }

    public void perdreArgent(int n) {
        this.argent -= n;
    }
}

