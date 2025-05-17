package ctsStructurale.adapter.classes;

public class AdapterObiecte implements SistemBileteTrenAbstract{
    private SistemBileteAutobuzAbstract sistemBileteAutobuzAbstract;

    public AdapterObiecte(SistemBileteAutobuzAbstract sistemBileteAutobuzAbstract) {
        this.sistemBileteAutobuzAbstract = sistemBileteAutobuzAbstract;
    }

    @Override
    public void rezervaLoc(int nrVagon, int nrLoc) {
        sistemBileteAutobuzAbstract.cumparaBilet();
    }
}
