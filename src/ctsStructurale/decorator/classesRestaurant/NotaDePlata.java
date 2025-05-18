package ctsStructurale.decorator.classesRestaurant;

public class NotaDePlata implements DocumentPrintat {

    private int valoarePlata;

    public NotaDePlata(int valoarePlata) {
        this.valoarePlata = valoarePlata;
    }

    @Override
    public void sePrinteaza() {
        System.out.println("Nota de plata: "+valoarePlata);
    }
}
