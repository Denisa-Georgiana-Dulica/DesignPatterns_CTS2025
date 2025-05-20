package cts.flyweight.classes;

public class RetetaContext {
    private final int nrReteta;
    private final float suma;
    private final int nrMedicamente;

    public RetetaContext(int nrReteta, float suma, int nrMedicamente) {
        this.nrReteta = nrReteta;
        this.suma = suma;
        this.nrMedicamente = nrMedicamente;
    }

    public int getNrReteta() {
        return nrReteta;
    }

    public float getSuma() {
        return suma;
    }

    public int getNrMedicamente() {
        return nrMedicamente;
    }
}
