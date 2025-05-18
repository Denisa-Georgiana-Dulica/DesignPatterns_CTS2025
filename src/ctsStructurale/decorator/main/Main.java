package ctsStructurale.decorator.main;

import ctsStructurale.decorator.classes.*;
import ctsStructurale.decorator.classesRestaurant.DecoratorFelicitare;
import ctsStructurale.decorator.classesRestaurant.DecoratorNotaDePlata;
import ctsStructurale.decorator.classesRestaurant.DocumentPrintat;
import ctsStructurale.decorator.classesRestaurant.NotaDePlata;

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

        /*Cu ocazia sărbătorilor de sfârșit de an managerul restaurantului dorește
        ca atunci când este printat o notă să se printeze și o felicitare de la Mulți
        ani pentru client. Se dorește adăugarea acestei noi funcționalități pentru
        clasa NotaDePlata la printare*/

        DocumentPrintat notaPlata=new NotaDePlata(200);
        notaPlata.sePrinteaza();
        System.out.println("------------------------------------");
        DecoratorFelicitare notaDePlataCuFelicitare=new DecoratorFelicitare(notaPlata);
        notaDePlataCuFelicitare.sePrinteaza();
    }
}
