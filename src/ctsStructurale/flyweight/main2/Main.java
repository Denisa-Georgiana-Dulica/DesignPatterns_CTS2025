package ctsStructurale.flyweight.main2;

import ctsStructurale.flyweight.classesRestaurant.RezervareClient;
import ctsStructurale.flyweight.classesRestaurant.RezervareContext;
import ctsStructurale.flyweight.classesRestaurant.RezervareFactory;

public class Main {
    private static RezervareClient[] rezervari=new RezervareClient[10];
    private static RezervareContext[] detaliiRezervari=new RezervareContext[10];
    private static int nrRezervari=0;

    public static void creeazaRezervare(String nume, String nrTelefon, String email, int nrMasa, int ora, int nrPersoane, RezervareFactory factory)
    {
        rezervari[nrRezervari]= factory.getRezervare(nume,nrTelefon,email);
        detaliiRezervari[nrRezervari]=new RezervareContext(nrMasa,nrPersoane,ora);
        nrRezervari++;
    }
    public static void main(String[] args) {
        /*Pentru fiecare rezervare trebuie să se rețină informații
        cu privire la clientul restaurantului precum: nume, număr de
        telefon, adresă de mail, etc, precum și informațiile despre
        masa rezervata: număr masa, număr persoane, ora rezervare, etc.
        Astfel, dacă un client realizează mai multe rezervări, la fiecare
        rezervare, informațiile despre client sunt aceleași și se repetă,
        ocupând foarte multă memorie. Să se implementeze modulul de memorare
        al rezervărilor astfel încât să nu ocupe memorie foarte multă.*/

        RezervareFactory factory=new RezervareFactory();
        creeazaRezervare("Denisa","075555555","denisa@gmail.com",1,14,2,factory);
        creeazaRezervare("Denisa","075555555","denisa@gmail.com",2,20,8,factory);
        creeazaRezervare("Crina","075555555","crina@gmail.com",1,14,2,factory);

        for(int i=0;i<nrRezervari;i++)
        {
            rezervari[i].rezerva(detaliiRezervari[i]);
        }
    }
}
