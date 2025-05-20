package cts.facade.classes;

public class Medic {
    private boolean esteConfirmataInternarea;

    public Medic(boolean esteConfirmataInternarea) {
        this.esteConfirmataInternarea = esteConfirmataInternarea;
    }

    public boolean confirmaInternarea()
    {
        if(esteConfirmataInternarea)
        {
            System.out.println("Medicul a confirmat internarea");
        }
        return esteConfirmataInternarea;
    }

    public boolean refuzaInternarea()
    {
        if(!esteConfirmataInternarea)
        {
            System.out.println("Medicul a refuzat internarea");
        }
        return esteConfirmataInternarea;
    }
}
