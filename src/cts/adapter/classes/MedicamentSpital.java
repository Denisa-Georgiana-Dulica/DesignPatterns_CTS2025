package cts.adapter.classes;

public class MedicamentSpital implements MedicamentSpitalAbstract{

    private String denumire;
    private float pret;

    public MedicamentSpital(String denumire, float pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public void achizitioneazaMedicament() {
        prezintaReteta();
        System.out.println("S-a achizitionat medicamentul "+this.denumire+" la pretul "+this.pret+" lei");
    }

    @Override
    public void prezintaReteta() {
        System.out.println("Este prezentata reteta pentru medicamentul "+this.denumire);
    }
}
