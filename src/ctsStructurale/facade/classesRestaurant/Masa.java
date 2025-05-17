package ctsStructurale.facade.classesRestaurant;

public class Masa {
    private boolean esteLibera;
    private int nrMasa;
    private int nrPersoane;

    public Masa(boolean esteAranjata, int nrMasa, int nrPersoane) {
        this.esteLibera = esteAranjata;
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
    }

    public boolean isEsteLibera() {
        return esteLibera;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }
}
