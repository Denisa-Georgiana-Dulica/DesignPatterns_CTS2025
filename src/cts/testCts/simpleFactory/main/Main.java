package cts.testCts.simpleFactory.main;

import cts.testCts.simpleFactory.classes.AlertRaport;
import cts.testCts.simpleFactory.classes.FieldRaport;
import cts.testCts.simpleFactory.classes.RaportFactory;
import cts.testCts.simpleFactory.classes.Situation;

public class Main {
    public static void main(String[] args) {
        RaportFactory raportFactory=new RaportFactory();
        FieldRaport fieldRaport=raportFactory.getRaport(Situation.ALERT);
        fieldRaport.showSituation();

        FieldRaport fieldRaport2=raportFactory.getRaport(Situation.INFORMATION);
        fieldRaport2.showSituation();

        FieldRaport fieldRaport3=raportFactory.getRaport(Situation.WARNING);
        fieldRaport3.showSituation();

        FieldRaport fieldRaport4=raportFactory.getRaport(Situation.ALERT);
        fieldRaport4.showSituation();
    }
}
