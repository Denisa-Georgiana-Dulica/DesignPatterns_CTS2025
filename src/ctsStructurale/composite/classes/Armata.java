package ctsStructurale.composite.classes;

import java.util.ArrayList;
import java.util.List;

public class Armata extends LuptatorAbstract{
    //ierarhia nodurilor composite

    List<LuptatorAbstract> luptatori=new ArrayList<>();

    public Armata(String nume) {
        super(nume);
    }

    @Override
    public void ataca(String arma) {
        for(LuptatorAbstract l:this.luptatori)
        {
            l.ataca(arma);
        }
        System.out.println("            " + this.nume + " a terminat lupta");
    }

    @Override
    public void seApara() {
        for(LuptatorAbstract l:this.luptatori){
            l.seApara();
        }
    }

    @Override
    public void seVindeca() {
        for(LuptatorAbstract l:this.luptatori){
            l.seVindeca();
        }
    }

    @Override
    public void adaugaLuptator(LuptatorAbstract nod) {
        this.luptatori.add(nod);
    }

    @Override
    public void stergeLuptator(int index) {
        if(index>0 && index<luptatori.size())
        {
            System.out.println("Luptatorul " + this.luptatori.get(index).getNume() + " a fost sters");
            this.luptatori.remove(index);
        }
    }

    @Override
    public LuptatorAbstract getLuptator(String nume) {
       LuptatorAbstract l=null;
        for(LuptatorAbstract luptator : luptatori){
            if(luptator.getNume().equals(nume)) {
                    l = luptator;
            }
        }
        return l;
    }


}
