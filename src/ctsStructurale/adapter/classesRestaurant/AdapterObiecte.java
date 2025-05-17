package ctsStructurale.adapter.classesRestaurant;

public class AdapterObiecte implements SistemBarAbstract{
    private SistemPrintareFacturiAbstract sistemPrintareFacturiAbstract;

    public AdapterObiecte(SistemPrintareFacturiAbstract sistemPrintareFacturiAbstract) {
        this.sistemPrintareFacturiAbstract = sistemPrintareFacturiAbstract;
    }

    @Override
    public void emiteFactura() {
        sistemPrintareFacturiAbstract.printareFactura();
    }
}
