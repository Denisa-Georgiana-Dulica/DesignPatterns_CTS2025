package ctsStructurale.facade.classes;

public class MasinaSpalat {
    protected boolean esteInchisa=false;
    protected int nrOreProgram=0;

    public void porneste()
    {
        esteInchisa=false;
        System.out.println("Porneste masina de spalat");
    }

    public void opreste()
    {
        esteInchisa=true;
        System.out.println("Opreste masina de spalat");
    }

    public void seteazaOreProgram(int ore)
    {
        this.nrOreProgram=ore;
        System.out.println("Seteaza program: "+ore+" ore");
    }
}
