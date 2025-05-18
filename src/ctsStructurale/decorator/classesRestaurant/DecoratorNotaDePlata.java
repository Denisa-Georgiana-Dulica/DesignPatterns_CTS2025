package ctsStructurale.decorator.classesRestaurant;

public class DecoratorNotaDePlata implements DocumentPrintat {

    private DocumentPrintat notaDePlata;

    public DecoratorNotaDePlata(DocumentPrintat notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    @Override
    public void sePrinteaza() {
        notaDePlata.sePrinteaza();
    }
}
