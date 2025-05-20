package ctsStructurale.facade.main;

import ctsStructurale.facade.classes.*;
import ctsStructurale.facade.classesRestaurant.Masa;
import ctsStructurale.facade.classesRestaurant.Ospatar;
import ctsStructurale.facade.classesRestaurant.Picollo;
import ctsStructurale.facade.classesRestaurant.Receptioner;
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
        verificată gravitatea stării pacientului prin intermediul clasei DateReteta,
        verificarea confirmării Medicului că trebuie internat,
        verificarea disponibilității unui pat în cameră prin intermediul clasei Salon care are lista cu paturile libere si ocupate.
        Spitalul dorește ca personalul spitalului să nu fi nevoit să facă aceste
        verificări separat ci să fie dezvoltat un modul care să permită această verificarea facilă a
        acestor lucruri. */

        Internare verificare=new Internare(new Medic(),new Pacient(), new Salon());
        verificare.acceptaInternarea();
        verificare.refuzaInternarea();

        /*În momentul în care un client vine la restaurant pentru o masă, recepționistul trebuie să verifice
        dacă are masă liberă, apoi să verifice dacă acea masă a fost debarasată de la plecarea ultimului client,
        de asemenea trebuie să verifice dacă au fost puse șervețele noi pe masă. Managerul restaurantului dorește
        realizarea unui modul care să simplifice munca recepționistului și să nu mai fie nevoit să verifice în toate
        locurile ci doar într-un singur loc.*/

        Receptioner receptioner=new Receptioner();
        receptioner.verificaMasa(new Masa(true,20,2));
    }
}
