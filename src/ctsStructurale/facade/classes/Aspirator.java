package ctsStructurale.facade.classes;

public class Aspirator {
    protected boolean estePornit=false;

    public void porneste()
    {
        estePornit=true;
        System.out.println("Porneste aspirator");
    }

    public void opreste()
    {
        estePornit=false;
        System.out.println("Opreste aspirator");
    }
}
