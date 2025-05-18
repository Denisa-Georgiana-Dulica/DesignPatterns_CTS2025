package ctsStructurale.proxy.main;

import ctsStructurale.facade.classesSpital.Internare;
import ctsStructurale.proxy.classesRestaurant.ProxyRezervare;
import ctsStructurale.proxy.classesRestaurant.Rezervare;
import ctsStructurale.proxy.classesSpital.Pacient;
import ctsStructurale.proxy.classes.AbstractLogin;
import ctsStructurale.proxy.classes.Login;
import ctsStructurale.proxy.classes.ProxyLogin;
import ctsStructurale.proxy.classesSpital.ProxyInternare;

public class Main {
    public static void main(String[] args) {
        AbstractLogin login=new Login("admin","admin");
        ProxyLogin proxyLogin=new ProxyLogin(login);
        proxyLogin.login("admin","a");
        proxyLogin.login("admin","admin");
        proxyLogin.login("admin","a");
        proxyLogin.login("admin","a");

        /*Deoarece Spitalul este supraaglomerat se impune ca atunci când pacienții
        doresc internarea să fie internate doar personale care au asigurare de sănătate.
        Sa se realizeze un nivel intermediar care sa permită internarea doar acestor persoane. */

       Pacient pacient=new Pacient(false);
       ProxyInternare proxyInternare=new ProxyInternare(pacient);
       proxyInternare.interneaza();

       /*Managerul restaurantului dorește ca atunci când cineva dorește să realizez e o
       rezervare sa fie permisă doar dacă aceasta este realizată pentru minim 4 persoane.
       În sens contrar rezervarea nu este realizata, iar persoanele sunt rugate să se prezinte
       la restaurant deoarece sunt suficiente locuri pentru mesele de doua persoane.
       Sa se realizeze un nivel intermediar care sa condiționeze realizarea rezervărilor de numărul de persoane.*/

        ProxyRezervare proxyRezervare=new ProxyRezervare(new Rezervare());
        proxyRezervare.rezervaMasa(3);
    }
}
