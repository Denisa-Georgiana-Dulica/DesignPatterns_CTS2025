package cts.decorator.classes;

public class BonDeCasa implements DocumentPrintat{

    @Override
    public void printeaza() {
        System.out.println("S-a printat bonul");
    }
}
