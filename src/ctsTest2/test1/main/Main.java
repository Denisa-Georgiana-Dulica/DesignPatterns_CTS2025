package ctsComportamentale.test1.main;

import ctsComportamentale.test1.classes.chain.*;

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
    }
}
