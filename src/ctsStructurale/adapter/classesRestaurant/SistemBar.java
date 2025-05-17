package ctsStructurale.adapter.classesRestaurant;

public class SistemBar implements SistemBarAbstract{

    private String denumireProdus="Cafea";

    @Override
    public void emiteFactura() {
        System.out.println("Factura pentru "+denumireProdus);
    }
}
