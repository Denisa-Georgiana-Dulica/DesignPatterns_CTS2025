package ctsStructurale.facade.classesSpital;

public class Medic {
    protected boolean areNevoieDeInternare=false;

    public void confirmaInternare()
    {
        areNevoieDeInternare=true;
        System.out.println("Are nevoie de internare");
    }

    public void nuConfirmaInternare()
    {
        areNevoieDeInternare=false;
        System.out.println("Nu are nevoie de internare");
    }
}
