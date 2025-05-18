package ctsComportamentale.command.classes;

public abstract class Ordin {
    private int nrActiuni;

    public Ordin(int nrActiuni) {
        this.nrActiuni = nrActiuni;
    }

    public int getNrActiuni() {
        return nrActiuni;
    }

    public abstract void executa(int nrActiuni);
}
