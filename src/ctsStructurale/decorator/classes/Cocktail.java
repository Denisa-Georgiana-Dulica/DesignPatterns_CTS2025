package ctsStructurale.decorator.classes;

public class Cocktail implements Bautura{
    //clasa concreta
    private String nume;

    public Cocktail(String nume) {
        this.nume = nume;
    }

    @Override
    public void sePrepara() {
        System.out.println("Se prepara "+this.nume);
    }

    @Override
    public void seConsuma() {
        System.out.println("Se consuma  "+this.nume);
    }


}
