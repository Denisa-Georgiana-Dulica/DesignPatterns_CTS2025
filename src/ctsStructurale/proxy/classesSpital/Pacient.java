package ctsStructurale.proxy.classesSpital;

public class Pacient implements AbstractInternare{
    private boolean areCardDeSabatate;

    public Pacient(boolean areCardDeSabatate) {
        this.areCardDeSabatate = areCardDeSabatate;
    }

    @Override
    public boolean interneaza() {
        return areCardDeSabatate;
    }
}
