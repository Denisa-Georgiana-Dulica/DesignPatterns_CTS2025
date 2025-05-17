package ctsStructurale.facade.classes;

public class Alexa {
    Frigider frigider;
    Aspirator aspirator;
    Lumini luminiBucatarie;
    Lumini luminiDormitor;
    MasinaSpalat masinaSpalat;

    public Alexa(Frigider frigider, Aspirator aspirator, Lumini luminiBucatarie, Lumini luminiDormitor, MasinaSpalat masinaSpalat) {
        this.frigider = frigider;
        this.aspirator = aspirator;
        this.luminiBucatarie = luminiBucatarie;
        this.luminiDormitor = luminiDormitor;
        this.masinaSpalat = masinaSpalat;
    }

    public void bunaDimineata()
    {
        luminiBucatarie.aprinde();
        luminiDormitor.stinge();
        System.out.println("Buna dimineata");
    }

    public void noapteBuna()
    {
        luminiBucatarie.stinge();
        luminiDormitor.aprinde();
        frigider.inchide();
        masinaSpalat.opreste();
        System.out.println("Noapte buna");
    }

    public void sporLaGatit()
    {
        luminiBucatarie.aprinde();
        frigider.deschide();
        luminiBucatarie.seteazaCuloarea("Galben");

        System.out.println("Succes la gatit");
    }
}
