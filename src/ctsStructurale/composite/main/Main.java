package ctsStructurale.composite.main;

import ctsStructurale.composite.classes.Armata;
import ctsStructurale.composite.classes.Luptator;

public class Main {
    public static void main(String[] args) {
        Luptator soldat1 = new Luptator("s1");
        Luptator soldat2 = new Luptator("s2");
        Luptator soldat3 = new Luptator("s3");
        Luptator soldat4 = new Luptator("s4");
        Luptator general = new Luptator("Generalul");
        Armata val1 = new Armata("Armata din valul 1");
        Armata val2 = new Armata("Armata din valul 2");
        Armata suprem = new Armata("Armata suprem");

        val2.adaugaLuptator(val1);
        val2.adaugaLuptator(soldat3);
        val2.adaugaLuptator(soldat4);
        val1.adaugaLuptator(soldat1);
        val1.adaugaLuptator(soldat2);
        suprem.adaugaLuptator(val2);
        suprem.adaugaLuptator(general);

        suprem.ataca("Cutit");

    }
}
