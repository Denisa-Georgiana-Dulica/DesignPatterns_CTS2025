package cts.adapter.main;

import cts.adapter.classes.AdaptorObiecte;
import cts.adapter.classes.MedicamentFarmacie;
import cts.adapter.classes.MedicamentFarmacieAbstract;
import cts.adapter.classes.MedicamentSpital;

public class Main {
    private static void vindeMedicament(MedicamentFarmacieAbstract medicamentFarmacieAbstract)
    {
        System.out.println("Farmacia nostra va ofera medicamentul: ");
        medicamentFarmacieAbstract.cumpărăMedicament();
    }
    public static void main(String[] args) {
        /*Spitalul deține un mic magazin pentru medicamente și au o aplicație pentru cumpărarea de
         medicamente pe baza de rețetă. Spitalul închei un contrat cu o farmacie specializată și
          dorește să integreze sistemul informatic al farmaciei cu sistemul software existent în
           micul magazin de medicamente. Dezvoltatorii farmaciei trebuie să integreze aceste două
           aplicații, astfel încât aplicația farmaciei să poate folosi obiectele de tip Medicament
            din aplicația spitalului. Clasa Medicament din aplicația spitalului are metodele
            achizitioneazaMedicament() și prezintaReteta(). Metoda prezintaReteta() este apelată
            din achizitioneazaMedicament() pentru verificarea rețetei. Clasa Medicament din aplicația
            farmaciei are o singură metodă cumpărăMedicament() în care nu se face verificarea rețetei,
            deoarece farmacia o să vândă medicamente și fără rețetă.*/

        MedicamentFarmacieAbstract medicamentFarmacie1=new MedicamentFarmacie("Nurofen",50,true);
        vindeMedicament(medicamentFarmacie1);

        //daca vreau sa vand un medicamentele pe baza de reteta nu pot (trebuie sa folosesc adapter)
        AdaptorObiecte adaptorObiecte=new AdaptorObiecte(new MedicamentSpital("Antibiotic",100));
        vindeMedicament(adaptorObiecte);
    }
}
