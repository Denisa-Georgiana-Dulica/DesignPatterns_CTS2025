package ctsStructurale.adapter.main;

import ctsStructurale.adapter.classes.AdaptorClase;
import ctsStructurale.adapter.classes.AdaptorObiecte;
import ctsStructurale.adapter.classes.SistemBileteAutobuz;
import ctsStructurale.adapter.classes.SistemBileteAutobuzAbstract;
import ctsStructurale.adapter.classesRestaurant.AdapterObiecte;
import ctsStructurale.adapter.classesRestaurant.SistemPrintareFacturiAbstract;
import ctsStructurale.adapter.classesRestaurant.SistemPrintareFacturiBucatarie;

public class Main {
    public static void main(String[] args) {
        //adaptor de obiecte
        SistemBileteAutobuzAbstract sistemBileteAutobuz=new SistemBileteAutobuz();
        AdaptorObiecte adaptorObiect=new AdaptorObiecte(sistemBileteAutobuz);
        adaptorObiect.rezervaLoc(2,4);

        //adaptor de clase
        AdaptorClase adaptorClase=new AdaptorClase();
        adaptorClase.rezervaLoc(4,29);

        /*B.5. Restaurantul achiziționează un nou -soft nou pentru lucrul de la bar-, însă acesta nu este compatibil cu -softul
        de printare facturi- folosit pentru produsele de la bucătărie. Vechiul soft era compatibil deoarece au fost realizate
        de aceeași echipa. Să se implementeze un nivel intermediar prin care noul soft să poată fi folosit cu softul existent,
        fără a se modifica codul din vreo aplicație.*/
        SistemPrintareFacturiAbstract sistemPrintareFacturiAbstract=new SistemPrintareFacturiBucatarie();
        AdapterObiecte adapterObiecteRestaurant=new AdapterObiecte(sistemPrintareFacturiAbstract);
        adapterObiecteRestaurant.emiteFactura();

    }
}
