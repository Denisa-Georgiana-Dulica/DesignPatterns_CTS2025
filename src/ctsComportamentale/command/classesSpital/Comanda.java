package ctsComportamentale.command.classesSpital;

public abstract class Comanda {
    private String numePacient;

    public Comanda(String numePacient) {
        this.numePacient = numePacient;
    }

    public String getNumePacient() {
        return numePacient;
    }

    public abstract void executaComanda(String numePacient);
}
