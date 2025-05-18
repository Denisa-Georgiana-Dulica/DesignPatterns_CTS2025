package ctsComportamentale.command.classesSpital;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    List<Comanda> comenzi=new ArrayList<>();

    public void adaugaComanda(Comanda comanda)
    {
        comenzi.add(comanda);
    }

    public void trimiteComenzi()
    {
        for(Comanda c:comenzi)
        {
            c.executaComanda(c.getNumePacient());
        }
    }
}
