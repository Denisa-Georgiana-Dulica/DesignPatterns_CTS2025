package cts.flyweight.classes;

public class DateReteta implements RetetaPacientAbstract {

    private final String nume;
    private final int nrAsigurare;

    public DateReteta(String nume, int nrAsigurare) {
        this.nume = nume;
        this.nrAsigurare = nrAsigurare;
    }

    @Override
    public void achizitioneazaReteta(RetetaContext retetaContext) {
        System.out.println(nume+" a cumparat "+retetaContext.getNrMedicamente()+" medicamete in valoare de "+retetaContext.getSuma());
    }
}
