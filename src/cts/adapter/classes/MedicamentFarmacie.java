package cts.adapter.classes;

public class MedicamentFarmacie implements MedicamentFarmacieAbstract{

    private String denumire;
    private float pret;
    private boolean esteInStoc;

    public MedicamentFarmacie(String denumire, float pret, boolean esteInStoc) {
        this.denumire = denumire;
        this.pret = pret;
        this.esteInStoc = esteInStoc;
    }

    @Override
    public void cumpărăMedicament() {
        if(esteInStoc)
        {
            System.out.println("S-a achizitionat medicamentul "+this.denumire+" la pretul "+this.pret+" lei");
        }else{
            System.out.println("Medicamentul nu mai este in stoc");
        }
    }
}
