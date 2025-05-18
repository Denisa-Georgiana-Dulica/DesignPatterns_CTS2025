package ctsStructurale.composite.classesRestaurant;

public abstract class AbstractProdus {
    private String denumire;

    public AbstractProdus(String denumire) {
        this.denumire = denumire;
    }

    public String getDenumire() {
        return denumire;
    }

    //metode pentru noduri frunza+compuse
    public abstract void afiseazaProdus();
    //metode pentru noduri compuse
    public abstract void adaugaProdus(AbstractProdus produs);
    public abstract void stergeProdus(int index);
    public abstract AbstractProdus getProdus(String denumire);

}
