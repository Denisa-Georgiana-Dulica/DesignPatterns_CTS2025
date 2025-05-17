package ctsStructurale.facade.classesSpital;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    protected List<Pat> listaPaturi=new ArrayList<>();
    protected int nrPaturi=200;
    protected boolean existaPaturiLibere=false;

    public Salon()
    {
        for(int i=0;i<nrPaturi;i++)
        {
            boolean ocupat=(i%2==0);
            Pat pat=new Pat(ocupat);
            listaPaturi.add(pat);
        }
    }

    public void existaPaturiLibere()
    {

        for(Pat p:listaPaturi)
        {
            if(p.esteOcupat==false)
            {
                existaPaturiLibere=true;
                System.out.println("Exista paturi libere");
                p.esteOcupat=true;
                break;
            }
        }
        if(existaPaturiLibere==false)
        {
            System.out.println("Nu exista paturi libere");
        }
    }
}
