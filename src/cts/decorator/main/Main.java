package cts.decorator.main;

import cts.decorator.classes.BonDeCasa;
import cts.decorator.classes.DecoratorFelicitare;

public class Main {
    public static void main(String[] args) {
        BonDeCasa bonDeCasa=new BonDeCasa();
        DecoratorFelicitare bonCuFelicitare=new DecoratorFelicitare(bonDeCasa);
        bonCuFelicitare.printeaza();
    }
}
