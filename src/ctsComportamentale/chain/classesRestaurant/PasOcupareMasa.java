package ctsComportamentale.chain.classesRestaurant;

public abstract class PasOcupareMasa {
    protected PasOcupareMasa urmatorulPas;

    public void seteazaUrmatorulPas(PasOcupareMasa urmatorulPas)
    {
        this.urmatorulPas=urmatorulPas;
    }

    public abstract void executaPas(Masa masa);
}
