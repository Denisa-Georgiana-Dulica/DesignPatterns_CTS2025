package ctsStructurale.adapter.main;

import ctsStructurale.adapter.classes.AdapterClase;
import ctsStructurale.adapter.classes.AdapterObiecte;
import ctsStructurale.adapter.classes.SistemBileteAutobuz;
import ctsStructurale.adapter.classes.SistemBileteAutobuzAbstract;
import ctsStructurale.adapter.classesRestaurant.SistemPrintareFacturiAbstract;
import ctsStructurale.adapter.classesRestaurant.SistemPrintareFacturiBucatarie;

public class Main {
    public static void main(String[] args) {
        //adaptor de obiecte
        SistemBileteAutobuzAbstract sistemBileteAutobuz=new SistemBileteAutobuz();
        AdapterObiecte adaptorObiect=new AdapterObiecte(sistemBileteAutobuz);
        adaptorObiect.rezervaLoc(2,4);

        //adaptor de clase
        AdapterClase adaptorClase=new AdapterClase();
        adaptorClase.rezervaLoc(4,29);

        /*B.5. Restaurantul achiziționează un nou -soft nou pentru lucrul de la bar-, însă acesta nu este compatibil cu -softul
        de printare facturi- folosit pentru produsele de la bucătărie. Vechiul soft era compatibil deoarece au fost realizate
        de aceeași echipa. Să se implementeze un nivel intermediar prin care noul soft să poată fi folosit cu softul existent,
        fără a se modifica codul din vreo aplicație.*/
        SistemPrintareFacturiAbstract sistemPrintareFacturiAbstract=new SistemPrintareFacturiBucatarie();
        ctsStructurale.adapter.classesRestaurant.AdapterObiecte adapterObiecteRestaurant=new ctsStructurale.adapter.classesRestaurant.AdapterObiecte(sistemPrintareFacturiAbstract);
        adapterObiecteRestaurant.emiteFactura();

        ctsStructurale.adapter.classesRestaurant.AdapterClase adapterClase=new ctsStructurale.adapter.classesRestaurant.AdapterClase();
        adapterClase.emiteFactura();


    }
}
