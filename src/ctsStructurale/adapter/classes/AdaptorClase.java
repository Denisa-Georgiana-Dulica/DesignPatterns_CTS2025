package ctsStructurale.adapter.classes;

public class AdaptorClase extends SistemBileteAutobuz implements SistemBileteTrenAbstract{

    @Override
    public void rezervaLoc(int nrVagon, int nrLoc) {
        cumparaBilet();
    }
}
