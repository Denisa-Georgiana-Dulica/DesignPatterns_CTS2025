package cts.flyweight.classes;

import java.util.HashMap;
import java.util.Map;

public class RetetaFactory {
    private Map<Integer, DateReteta> retete=new HashMap<>();

    public DateReteta getReteta(int nrAsigurare, String nume)
    {
        DateReteta reteta=retete.get(nrAsigurare);
        if(reteta==null)
        {
            reteta=new DateReteta(nume,nrAsigurare);
            retete.put(nrAsigurare,reteta);
        }
        return reteta;
    }
}
