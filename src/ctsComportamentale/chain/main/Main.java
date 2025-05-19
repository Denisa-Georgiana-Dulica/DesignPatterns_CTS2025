package ctsComportamentale.chain.main;

import ctsComportamentale.chain.classes.AprobatorBugete;
import ctsComportamentale.chain.classes.ManagerM1;
import ctsComportamentale.chain.classes.ManagerM2;
import ctsComportamentale.chain.classes.VicePresedinte;
import ctsComportamentale.chain.classesRestaurant.*;


public class Main {
    public static void main(String[] args) {

        //AVEM UN PROIECT MARE SI AVEM NEVOIE SA APROBAM BUGETELE
        //VIN CU PROPUNEREA LA MANAGER, DACA BUGETUL SE AFLA INTRE X SI Y POATE SA APROBE FARA SA VORBEASCA MAI DEPARTE, DACA NU, SI BUGETUL >Y MERGE MAI DEPARTE

        AprobatorBugete manager1= new ManagerM1();
        AprobatorBugete manager2= new ManagerM2();
        AprobatorBugete vicePresedinte= new VicePresedinte();
        manager1.seteazaUrmatorulAprobator(manager2);
        manager2.seteazaUrmatorulAprobator(vicePresedinte);

        manager1.aprobaBuget(2000);

        /*Ocuparea unei mese in restaurant se face după următorii pași:
        Se curata masa,
        Se așază șervetele,
        Se așază tacâmuri,
        sunt invitate persoanele sa se așeze la masa.
        Sa se implementeze modului care realizează in aplicație ocuparea meselor din restaurant.*/

        Masa masa=new Masa();
        PasCurataMasa curataMasa=new PasCurataMasa();
        PasAseazaServetele aseazaServetele=new PasAseazaServetele();
        PasAseazaTacamuri aseazaTacamuri=new PasAseazaTacamuri();
        PasCheamaPersoane cheamaPersoane=new PasCheamaPersoane();

        curataMasa.seteazaUrmatorulPas(aseazaServetele);
        aseazaServetele.seteazaUrmatorulPas(aseazaTacamuri);
        aseazaTacamuri.seteazaUrmatorulPas(cheamaPersoane);
        curataMasa.executaPas(masa);

    }
}
