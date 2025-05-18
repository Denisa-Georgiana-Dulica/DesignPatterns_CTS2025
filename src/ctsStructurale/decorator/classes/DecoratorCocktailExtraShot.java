package ctsStructurale.decorator.classes;

public class DecoratorCocktailExtraShot extends DecoratorCocktail{

    public DecoratorCocktailExtraShot(Bautura cocktail) {
        super(cocktail);
    }

    @Override
    public void sePrepara() {
        super.sePrepara();
        System.out.println("Se prepara cu extra shot");
    }

    @Override
    public void seConsuma() {
        super.seConsuma();
        System.out.println("A fost cu extra shot");
    }
}
