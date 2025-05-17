package ctsStructurale.adapter.classes;

public class SistemBileteTren implements SistemBileteTrenAbstract{
    private int nrVagoane = 6;
    private int nrLocuriPerVagon = 100;
    private int nrLocuriRezervate = 0;

    @Override
    public void rezervaLoc(int nrVagon, int nrLoc) {
        if(nrVagon>=1 && nrVagon<=this.nrVagoane)
        {
            if(nrLoc>0 && nrLoc<=this.nrLocuriPerVagon)
            {
                if(this.nrLocuriRezervate<600)
                {
                    System.out.println("Bilet rezervat");
                    this.nrLocuriRezervate++;
                }
            }
        }
    }
}
