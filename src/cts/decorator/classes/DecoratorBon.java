package cts.decorator.classes;

public class DecoratorBon implements DocumentPrintat{

    private DocumentPrintat documentPrintat;

    public DecoratorBon(DocumentPrintat documentPrintat) {
        this.documentPrintat = documentPrintat;
    }

    @Override
    public void printeaza() {
        documentPrintat.printeaza();
    }
}
