package ctsStructurale.composite.main;

import ctsStructurale.composite.classes.Armata;
import ctsStructurale.composite.classes.Luptator;
import ctsStructurale.composite.classesRestaurant.Meniu;
import ctsStructurale.composite.classesRestaurant.Produs;

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

        /*Este dorita reprezentarea meniului in cadrul aplicației.
        Meniul conține secțiuni (startere, băuturi, desert, etc.)
        fiecare secțiune poate conține subsecțiuni (sucuri, cafea,
        etc) sau item-uri (, apa plata, apa minerala, etc). Sa se
        realizeze modulul care permite reprezentarea arborescenta a
        meniului restaurantului.*/

        Produs p1=new Produs("cafea");
        Produs p2=new Produs("suc");
        Produs p3=new Produs("tort");
        Produs p4=new Produs("bruschete");
        Meniu sectiune1=new Meniu("bauturi");
        Meniu sectiune2=new Meniu("desert");
        Meniu sectiune3=new Meniu("starter");
        Meniu meniuFinal=new Meniu("Meniu");


        sectiune1.adaugaProdus(p1);
        sectiune1.adaugaProdus(p2);
        meniuFinal.adaugaProdus(sectiune1);
        sectiune2.adaugaProdus(p3);
        meniuFinal.adaugaProdus(sectiune2);
        sectiune3.adaugaProdus(p4);
        meniuFinal.adaugaProdus(sectiune3);
        meniuFinal.afiseazaProdus();


    }
}
