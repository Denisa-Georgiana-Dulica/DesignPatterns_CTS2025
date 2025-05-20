package cts.decorator.classes;

public class DecoratorFelicitare extends DecoratorBon{

    public DecoratorFelicitare(DocumentPrintat documentPrintat) {
        super(documentPrintat);
    }

    @Override
    public void printeaza() {
        super.printeaza();
        System.out.println("La multi ani");
    }
}
