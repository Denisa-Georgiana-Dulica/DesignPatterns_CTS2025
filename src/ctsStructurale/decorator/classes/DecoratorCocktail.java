package ctsStructurale.decorator.classes;

public class DecoratorCocktail implements Bautura{

    private Bautura cocktail;

    public DecoratorCocktail(Bautura cocktail) {
        this.cocktail = cocktail;
    }

    @Override
    public void sePrepara() {
        cocktail.sePrepara();
    }

    @Override
    public void seConsuma() {
        cocktail.seConsuma();
    }
}
