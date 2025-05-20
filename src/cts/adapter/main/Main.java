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
        MedicamentFarmacieAbstract medicamentFarmacie1=new MedicamentFarmacie("Nurofen",50,true);
        vindeMedicament(medicamentFarmacie1);

        //daca vreau sa vand un medicamentele pe baza de reteta nu pot (trebuie sa folosesc adapter)
        AdaptorObiecte adaptorObiecte=new AdaptorObiecte(new MedicamentSpital("Antibiotic",100));
        vindeMedicament(adaptorObiecte);
    }
}
