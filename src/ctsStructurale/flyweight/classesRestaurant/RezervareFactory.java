package ctsStructurale.flyweight.classesRestaurant;

import java.util.HashMap;
import java.util.Map;

public class RezervareFactory {
    Map<String, RezervareClient> rezervari=new HashMap<>();

    public RezervareClient getRezervare(String nume,String nrTelefon,String email)
    {
        RezervareClient rezervareClient=rezervari.get(email);
        if(rezervareClient==null)
        {
            rezervareClient=new RezervareClient(nume,nrTelefon,email);
            rezervari.put(email,rezervareClient);
        }
        return rezervareClient;
    }

    public int nrRezervari()
    {
        return rezervari.size();
    }
}
