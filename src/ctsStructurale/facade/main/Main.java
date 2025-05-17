package ctsStructurale.facade.main;

import ctsStructurale.facade.classes.*;

public class Main {
    public static void main(String[] args) {
        Alexa alexa=new Alexa(new Frigider(),new Aspirator(),new Lumini(),new Lumini(),new MasinaSpalat());
        alexa.bunaDimineata();
        alexa.sporLaGatit();
        alexa.noapteBuna();
    }
}
