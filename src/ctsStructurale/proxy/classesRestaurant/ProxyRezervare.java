package ctsStructurale.proxy.classesRestaurant;

public class ProxyRezervare implements AbstractRezervare{
    private AbstractRezervare rezervare;

    public ProxyRezervare(AbstractRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void rezervaMasa(int nrPersoane) {
        if(nrPersoane>4)
        {
            rezervare.rezervaMasa(nrPersoane);
        }
        else {
            System.out.println("Nr minim de persoane trebuie sa fie 4");
        }
    }
}
