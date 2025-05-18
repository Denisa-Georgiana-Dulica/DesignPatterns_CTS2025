package ctsComportamentale.command.classesSpital;

public class ComandaInternare extends Comanda {

    private MedicExecutant medicExecutant;

    public ComandaInternare(String numePacient, MedicExecutant medicExecutant) {
        super(numePacient);
        this.medicExecutant = medicExecutant;
    }

    @Override
    public void executaComanda(String numePacient) {
        medicExecutant.executaComada(numePacient);
    }
}
