package ctsComportamentale.command.classes;

import java.util.ArrayList;
import java.util.List;

public class AplicatieBroker {
    List<Ordin> ordine=new ArrayList<>();

    public void adaugaOrdin(Ordin ordin)
    {
        ordine.add(ordin);
    }

    public void trimiteOrdinLaExecutant()
    {
        for(Ordin o:ordine)
        {
            o.executa(o.getNrActiuni());
        }
    }
}
