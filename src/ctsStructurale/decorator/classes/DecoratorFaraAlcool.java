package ctsStructurale.decorator.classes;

public class DecoratorFaraAlcool extends DecoratorCocktail{

    public DecoratorFaraAlcool(Bautura cocktail) {
        super(cocktail);
    }

    @Override
    public void seConsuma() {
        super.seConsuma();
        System.out.println("Poti sa conduci dupa");
    }
}
