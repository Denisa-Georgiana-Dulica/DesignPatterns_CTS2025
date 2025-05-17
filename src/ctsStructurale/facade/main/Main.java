package ctsStructurale.facade.main;

import ctsStructurale.facade.classes.*;
import ctsStructurale.facade.classesSpital.Internare;
import ctsStructurale.facade.classesSpital.Medic;
import ctsStructurale.facade.classesSpital.Pacient;
import ctsStructurale.facade.classesSpital.Salon;

public class Main {
    public static void main(String[] args) {
        Alexa alexa=new Alexa(new Frigider(),new Aspirator(),new Lumini(),new Lumini(),new MasinaSpalat());
        alexa.bunaDimineata();
        alexa.sporLaGatit();
        alexa.noapteBuna();

        /*Pentru internarea unui pacient în spital trebuie
        verificată gravitatea stării pacientului prin intermediul clasei Pacient,
        verificarea confirmării Medicului că trebuie internat,
        verificarea disponibilității unui pat în cameră prin intermediul clasei Salon care are lista cu paturile libere si ocupate.
        Spitalul dorește ca personalul spitalului să nu fi nevoit să facă aceste
        verificări separat ci să fie dezvoltat un modul care să permită această verificarea facilă a
        acestor lucruri. */

        Internare verificare=new Internare(new Medic(),new Pacient(), new Salon());
        verificare.acceptaInternarea();
        verificare.refuzaInternarea();
    }
}
