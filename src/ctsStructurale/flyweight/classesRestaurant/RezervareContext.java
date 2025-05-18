package ctsStructurale.flyweight.classesRestaurant;

public class RezervareContext {
    private final int nrMasa;
    private final int nrPersoane;
    private final int oraRezervare;

    public RezervareContext(int nrMasa, int nrPersoane, int oraRezervare) {
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
        this.oraRezervare = oraRezervare;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public int getOraRezervare() {
        return oraRezervare;
    }
}
