package ctsStructurale.composite.classes;

public class Luptator extends LuptatorAbstract{
    //nod frunza

    public Luptator(String nume) {
        super(nume);
    }

    @Override
    public void ataca(String arma) {
        System.out.println(this.nume + " ataca cu " +  arma);
    }

    @Override
    public void seApara() {
        System.out.println(this.nume + " se apara!");
    }

    @Override
    public void seVindeca() {
        System.out.println(this.nume + " se vindeca");
    }

    @Override
    public void adaugaLuptator(LuptatorAbstract nod) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeLuptator(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public LuptatorAbstract getLuptator(String nume) {
        throw new UnsupportedOperationException();
    }

}
