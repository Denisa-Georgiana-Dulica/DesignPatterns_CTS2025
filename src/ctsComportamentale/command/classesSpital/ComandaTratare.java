package ctsComportamentale.command.classesSpital;

public class ComandaTratare extends Comanda{

    private MedicExecutant medicExecutant;

    public ComandaTratare(String numePacient, MedicExecutant medicExecutant) {
        super(numePacient);
        this.medicExecutant = medicExecutant;
    }

    @Override
    public void executaComanda(String numePacient) {
        medicExecutant.executaComada(numePacient);
    }
}
