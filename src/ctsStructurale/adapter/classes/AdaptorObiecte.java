package ctsStructurale.adapter.classes;

public class AdaptorObiecte implements SistemBileteTrenAbstract{
    private SistemBileteAutobuzAbstract sistemBileteAutobuzAbstract;

    public AdaptorObiecte(SistemBileteAutobuzAbstract sistemBileteAutobuzAbstract) {
        this.sistemBileteAutobuzAbstract = sistemBileteAutobuzAbstract;
    }

    @Override
    public void rezervaLoc(int nrVagon, int nrLoc) {
        sistemBileteAutobuzAbstract.cumparaBilet();
    }
}
