package ctsStructurale.adapter.classesRestaurant;

public class SistemPrintareFacturiBucatarie implements SistemPrintareFacturiAbstract{
    private String produs="Paine";
    private int cantitate=1;

    @Override
    public void printareFactura() {
        System.out.println("Factura pentru "+produs+" - "+cantitate);
    }
}
