package cts.adapter.classes;

public class AdaptorObiecte implements MedicamentFarmacieAbstract{
    private MedicamentSpitalAbstract medicamentSpitalAbstract;

    public AdaptorObiecte(MedicamentSpitalAbstract medicamentSpitalAbstract) {
        this.medicamentSpitalAbstract = medicamentSpitalAbstract;
    }

    @Override
    public void cumpărăMedicament() {
        medicamentSpitalAbstract.achizitioneazaMedicament();
    }
    //să poate folosi obiectele de tip Medicament din aplicația spitalului --> adaptor obiecte
}
