package ctsStructurale.composite.classesRestaurant;

import java.util.ArrayList;
import java.util.List;

public class Meniu extends AbstractProdus{

    private List<AbstractProdus> lista=new ArrayList<>();

    public Meniu(String denumire) {
        super(denumire);
    }

    @Override
    public void afiseazaProdus() {
        for(AbstractProdus p:lista)
        {
            p.afiseazaProdus();
        }
        System.out.println(getDenumire());
    }

    @Override
    public void adaugaProdus(AbstractProdus produs) {
        this.lista.add(produs);
    }

    @Override
    public void stergeProdus(int index) {
        if(index>0 && index<lista.size())
        {
            System.out.println(this.lista.get(index).getDenumire()+" a fost sters");
            this.lista.remove(index);
        }
    }

    @Override
    public AbstractProdus getProdus(String denumire) {
        AbstractProdus produs=null;
        for(AbstractProdus p:lista)
        {
            if(p.getDenumire().equals(denumire))
            {
                produs=p;
            }
        }
        return produs;
    }
}
