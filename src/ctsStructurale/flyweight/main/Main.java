package ctsStructurale.flyweight.main;

import ctsStructurale.flyweight.classes.Caracter;
import ctsStructurale.flyweight.classes.CaracterContext;
import ctsStructurale.flyweight.classes.CaracterFactory;

public class Main {
    private static Caracter[] caractereText=new Caracter[100];
    private static CaracterContext[] locatiiCaractere=new CaracterContext[100];
    private static int nrCaractere=0;

    public static void apasaTasta(String caracter, int locatie, CaracterFactory factory)
    {
        caractereText[nrCaractere]=factory.getCaracter(caracter);
        locatiiCaractere[nrCaractere]=new CaracterContext(locatie);
        nrCaractere++;
    }
    public static void main(String[] args) {
            CaracterFactory factory=new CaracterFactory();
            apasaTasta("a",nrCaractere,factory);
        apasaTasta("b",nrCaractere,factory);
        apasaTasta("f",nrCaractere,factory);
        apasaTasta("s",nrCaractere,factory);

        for(int i=0;i<nrCaractere;i++)
        {
            caractereText[i].printeaza(locatiiCaractere[i]);
        }

    }
}
