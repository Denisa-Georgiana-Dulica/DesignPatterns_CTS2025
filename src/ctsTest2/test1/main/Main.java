package ctsTest2.test1.main;

import ctsTest2.test1.classes.chain.*;
import ctsTest2.test1.classes.decorator.*;
import ctsTest2.test1.classes.decorator.AbstractAutoWashOptions;

public class Main {
    public static void main(String[] args) {
        FazaPrespalare fazaPrespalare=new FazaPrespalare();
        FazaPeriere fazaPeriere=new FazaPeriere();
        FazaCeruire fazaCeruire=new FazaCeruire();
        FazaUscare fazaUscare=new FazaUscare();

        fazaPrespalare.seteazaFazaUrmatoare(fazaPeriere);
        fazaPeriere.seteazaFazaUrmatoare(fazaCeruire);
        fazaCeruire.seteazaFazaUrmatoare(fazaUscare);

        WashProgram1 washProgram1=new WashProgram1();
        WashProgram2 washProgram2=new WashProgram2();
        fazaPrespalare.executaFaza(washProgram1);

        /*rulează în permanență și nu poate fi oprită spre a fi recompilată. - decorator
        * Orice extensie a funcționalității trebuie să se facă fără recompilare – deci la runtime (în timpul execuției).*/
        System.out.println("----------------------------");
        AbstractAutoWashOptions washProgram2Decorator=new WashProgram2Decorator();
        DecoratorSpalareApaDedurizata spalareCuApaDedurizata=new DecoratorSpalareApaDedurizata(washProgram2Decorator);
        spalareCuApaDedurizata.isBrushWashingSelected();

    }
}
