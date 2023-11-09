import personnages.principaux.*;
import personnages.Humain;
import personnages.secondaires.GrandMere;

public class MonHistoire {
    public static void main(String[] args) {
        Humain humain = new GrandMere("Prof", 10);
        humain.direBonjour();
        humain.boire();
        Commercant commercant = new Commercant("Marchand", 35);
        commercant.direBonjour();
        Yakuza yakusa = new Yakuza("Yaku␣le␣noir", 42,
                "biere", "WarSong");
        yakusa.direBonjour();
        yakusa.extorquer(commercant);
        Ronin ronin = new Ronin("Roro", 61, "sake");
        ronin.donner(10, commercant );
        ronin.provoquer(yakusa);
        ronin.direBonjour();

    }
}