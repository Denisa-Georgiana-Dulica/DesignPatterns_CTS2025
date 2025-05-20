package cts.facade.classes;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private List<Boolean> disponiilitatePaturi=new ArrayList<>();
    private boolean estePatLiber=false;

    public Salon() {
        for(int i=0;i<50;i++)
        {
            disponiilitatePaturi.add(i==51);
        }
    }

    public boolean verificaPaturiLibere()
    {
        for(Boolean b:disponiilitatePaturi)
        {
            if(b)
            {
                estePatLiber=true;
                System.out.println("Exista un pat liber");
                break;
            }
        }
        return estePatLiber;
    }
}
