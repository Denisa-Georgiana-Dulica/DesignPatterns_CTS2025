package cts.flyweight.main;

import cts.flyweight.classes.DateReteta;
import cts.flyweight.classes.RetetaContext;
import cts.flyweight.classes.RetetaFactory;

public class Main {
    private static DateReteta[] dateRetete=new DateReteta[10];
    private static RetetaContext[] retete=new RetetaContext[10];
    private static int nrRetete=0;
    private static void adaugaReteta(String nume, int nrAsigurare, int nrReteta, float suma, int nrMedicamente, RetetaFactory factory)
    {
        dateRetete[nrRetete]=factory.getReteta(nrAsigurare,nume);
        retete[nrRetete]=new RetetaContext(nrReteta,suma,nrMedicamente);
        nrRetete++;
    }
    public static void main(String[] args) {
        RetetaFactory factory=new RetetaFactory();
        adaugaReteta("Denisa",1,1,200,3,factory);
        adaugaReteta("Denisa",1,2,200,3,factory);
        adaugaReteta("Crina",2,1,200,3,factory);
        for(int i=0;i<nrRetete;i++)
        {
            dateRetete[i].achizitioneazaReteta(retete[i]);
        }
    }
}
