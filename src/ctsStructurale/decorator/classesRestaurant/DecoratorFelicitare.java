package ctsStructurale.decorator.classesRestaurant;

public class DecoratorFelicitare extends DecoratorNotaDePlata{

    public DecoratorFelicitare(DocumentPrintat notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void sePrinteaza() {
        super.sePrinteaza();
        System.out.println("La multi ani");
    }
}
