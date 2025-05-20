package cts.proxy.classes;

public class Internare implements InternareAbstract{
    private boolean areAsigurare;

    public Internare(boolean areAsigurare) {
        this.areAsigurare = areAsigurare;
    }

    @Override
    public boolean internare() {
        if(areAsigurare)
        {
            return true;
        }else{
            return false;
        }
    }
}
