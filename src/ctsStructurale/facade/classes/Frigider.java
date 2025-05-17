package ctsStructurale.facade.classes;

public class Frigider {
    protected boolean esteUsaDeschisa=false;
    protected boolean esteExtraFreezePornit=false;

    public void deschide()
    {
        esteUsaDeschisa=true;
        System.out.println("Deschide frigider");
    }

    public void inchide()
    {
        esteUsaDeschisa=false;
        System.out.println("Inchide frigider");
    }

    public void pornesteExtraFreeze()
    {
        esteExtraFreezePornit=true;
        System.out.println("Extra freeze activat");
    }

    public void opresteExtraFreeze()
    {
        esteExtraFreezePornit=false;
        System.out.println("Extra freeze dezactivat");
    }

}
