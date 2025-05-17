package ctsStructurale.adapter.classesRestaurant;

public class AdapterClase extends SistemPrintareFacturiBucatarie implements SistemBarAbstract{
    @Override
    public void emiteFactura() {
        printareFactura();
    }
}
