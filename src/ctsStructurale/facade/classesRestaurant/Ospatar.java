package ctsStructurale.facade.classesRestaurant;

import ctsStructurale.facade.main.Main;

public class Ospatar {
    public boolean esteAranjata(Masa masa)
    {
        return masa.getNrMasa()%5==0;
    }
}
