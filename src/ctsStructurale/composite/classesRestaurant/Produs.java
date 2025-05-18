package ctsStructurale.composite.classesRestaurant;

public class Produs extends AbstractProdus {
    public Produs(String denumire) {
        super(denumire);
    }

    @Override
    public void afiseazaProdus() {
        System.out.println("        "+getDenumire());
    }

    @Override
    public void adaugaProdus(AbstractProdus produs) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeProdus(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AbstractProdus getProdus(String denumire) {
        throw new UnsupportedOperationException();
    }
}
