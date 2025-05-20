package ctsStructurale.facade.classesSpital;

public class Pacient {
    protected boolean areStareGrava=false;

    public void stabilesteStareGrava()
    {
        areStareGrava=true;
        System.out.println("DateReteta cu stare grava");
    }

    public void stabilesteStareStabila()
    {
        areStareGrava=false;
        System.out.println("Pacientul nu are stare grava");
    }
}
