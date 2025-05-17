package ctsStructurale.adapter.classes;

public class SistemBileteAutobuz implements SistemBileteAutobuzAbstract{

    private int nrLocuri = 50;
    private int nrLocuriRezervate = 0;

    @Override
    public void cumparaBilet() {
        if(nrLocuriRezervate<nrLocuri)
        {
            nrLocuriRezervate++;
            System.out.println("Loc rezervat");
        }
    }
}
