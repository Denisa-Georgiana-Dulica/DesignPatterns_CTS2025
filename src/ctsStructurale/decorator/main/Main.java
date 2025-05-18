package ctsStructurale.decorator.main;

import ctsStructurale.decorator.classes.*;

public class Main {
    public static void main(String[] args) {
        //schimbare functionalitate la runtime
        //putem sa aplicam mai multe decoratoare pe acelasi obiect
        //decoratorul are o referinta catre produsul concret

        Bautura cocktail=new Cocktail("Amaretto Sour");
        //cocktail simplu
        cocktail.sePrepara();
        cocktail.seConsuma();
        System.out.println("------------------------------------");
        //Vreau sa fie fara alcool
        DecoratorFaraAlcool cocktailFaraAlcool=new DecoratorFaraAlcool(cocktail);
        cocktailFaraAlcool.seConsuma();
        System.out.println("------------------------------------");
        //Adaug un shot extra
        DecoratorCocktailExtraShot cocktailExtraShot=new DecoratorCocktailExtraShot(cocktailFaraAlcool);
        cocktailExtraShot.sePrepara();
        cocktailExtraShot.seConsuma();
        System.out.println("------------------------------------");
        //Vreau sa fie fara gheata
        DecoratorCocktailFaraGheata cocktailFaraGheataCuExtrasShot=new DecoratorCocktailFaraGheata(cocktailExtraShot);
        cocktailFaraGheataCuExtrasShot.sePrepara();
        cocktailFaraGheataCuExtrasShot.seConsuma();
    }
}
