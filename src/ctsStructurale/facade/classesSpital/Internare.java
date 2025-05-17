package ctsStructurale.facade.classesSpital;

public class Internare {
    Medic medic;
    Pacient pacient;
    Salon salon;

    public Internare(Medic medic, Pacient pacient, Salon salon) {
        this.medic = medic;
        this.pacient = pacient;
        this.salon = salon;
    }

    public void acceptaInternarea()
    {
        medic.confirmaInternare();
        pacient.stabilesteStareGrava();
        salon.existaPaturiLibere();
    }

    public void refuzaInternarea()
    {
        medic.nuConfirmaInternare();
        pacient.stabilesteStareStabila();
        salon.existaPaturiLibere();
    }
}
