package ctsComportamentale.command.main;

import ctsComportamentale.command.classes.AplicatieBroker;
import ctsComportamentale.command.classes.BrokerExecutant;
import ctsComportamentale.command.classes.OrdinCumparare;
import ctsComportamentale.command.classes.OrdinVanzare;
import ctsComportamentale.command.classesSpital.ComandaInternare;
import ctsComportamentale.command.classesSpital.MedicExecutant;
import ctsComportamentale.command.classesSpital.Operator;

public class Main {
    public static void main(String[] args) {
        AplicatieBroker aplicatieBroker=new AplicatieBroker();
        BrokerExecutant brokerExecutant=new BrokerExecutant();
        aplicatieBroker.adaugaOrdin(new OrdinCumparare(20,brokerExecutant));
        aplicatieBroker.adaugaOrdin(new OrdinVanzare(30,brokerExecutant));
        aplicatieBroker.trimiteOrdinLaExecutant();

        /*Managerul spitalului dorește sa grăbească procesul de la primiri urgente si
        astfel operatorul care primește pacienții la triaj va da comenzi de internare
        sau de tratare imediata pentru pacienții veniți si ii va așeza astfel la alte
        cozi separate. Comenzile sunt trimise către medici, însă operatorul poate primească
        alți pacienții mult mai rapid. Sa se implementeze modulul care permite trimiterea
        de comenzi către medici de la operatorul de primire. */

        Operator operator=new Operator();
        MedicExecutant medicExecutant=new MedicExecutant();
        operator.adaugaComanda(new ComandaInternare("Ion",medicExecutant));
        operator.adaugaComanda(new ComandaInternare("Vlad",medicExecutant));
        operator.trimiteComenzi();
    }
}
