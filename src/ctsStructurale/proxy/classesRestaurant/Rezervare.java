package ctsStructurale.proxy.classesRestaurant;

public class Rezervare implements AbstractRezervare{

    @Override
    public void rezervaMasa(int nrPersoane) {
        System.out.println("Rezervare pentru "+nrPersoane+" persoane");
    }
}
