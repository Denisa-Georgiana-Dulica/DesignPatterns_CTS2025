package cts.facade.classes;

public class VerificareAutomata {
    private Pacient pacient;
    private Medic medic;
    private Salon salon;

    public VerificareAutomata(Pacient pacient, Medic medic, Salon salon) {
        this.pacient = pacient;
        this.medic = medic;
        this.salon = salon;
    }

    public void interneaza()
    {
        if(pacient.seteazaStareGrava())
        {
            if(medic.confirmaInternarea())
            {
                if(salon.verificaPaturiLibere())
                {
                    System.out.println("DateReteta internat");
                }else{
                    System.out.println("Nu exista pat liber, nu se poate interna pacientul");
                }
            }else{
                medic.refuzaInternarea();
            }
        }else{
            pacient.seteazaStareStabila();
        }
    }
}
