package ctsStructurale.composite.classes;

public abstract class LuptatorAbstract {
    protected String nume;

    public LuptatorAbstract(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    //metode specifice nodurilor frunze si composite
    public abstract void ataca(String arma);
    public abstract void seApara();
    public abstract void seVindeca();

    //metode specifice nodurilor composite
    public abstract void adaugaLuptator(LuptatorAbstract nod);
    public abstract void stergeLuptator(int index);
    public abstract LuptatorAbstract getLuptator(String nume);

}
