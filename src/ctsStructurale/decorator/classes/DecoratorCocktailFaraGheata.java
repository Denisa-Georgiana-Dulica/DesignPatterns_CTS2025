package ctsStructurale.decorator.classes;

public class DecoratorCocktailFaraGheata extends DecoratorCocktail{

    public DecoratorCocktailFaraGheata(Bautura cocktail) {
        super(cocktail);
    }

    @Override
    public void sePrepara() {
        super.sePrepara();
        System.out.println("Se prepara fara gheata");
    }

    @Override
    public void seConsuma() {
        super.seConsuma();
        System.out.println("A fost fara gheata");
    }
}
