package cts.facade.classes;

public class Pacient {
    private boolean esteInStareGrava;

    public Pacient(boolean esteInStareGrava) {
        this.esteInStareGrava = esteInStareGrava;
    }

    public boolean seteazaStareGrava()
    {
        if(esteInStareGrava)
        {
            System.out.println("Este in stare grava");
        }
        return esteInStareGrava;
    }

    public boolean seteazaStareStabila()
    {
        if(!esteInStareGrava)
        {
            System.out.println("Este in stare stabila");
        }
        return esteInStareGrava;
    }

}
