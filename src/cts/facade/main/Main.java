package cts.facade.main;

import cts.facade.classes.Medic;
import cts.facade.classes.Pacient;
import cts.facade.classes.Salon;
import cts.facade.classes.VerificareAutomata;

public class Main {
    public static void main(String[] args) {
        /*Pentru internarea unui pacient în spital trebuie verificată gravitatea stării pacientului
        prin intermediul clasei Pacient, verificarea confirmării Medicului că trebuie internat, verificarea
        disponibilității unui pat în cameră prin intermediul clasei Salon care are lista cu paturile libere
        si ocupate. Spitalul dorește ca personalul spitalului să nu fi nevoit să facă aceste verificări separat
        ci să fie dezvoltat un modul care să permită această verificarea facilă a acestor lucruri.*/
        VerificareAutomata verificareAutomata=new VerificareAutomata(new Pacient(true),new Medic(true),new Salon());
        verificareAutomata.interneaza();

    }
}
