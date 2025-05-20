package cts.proxy.classes;

public class ProxyInternare implements InternareAbstract{

    private InternareAbstract internareAbstract;

    public ProxyInternare(InternareAbstract internareAbstract) {
        this.internareAbstract = internareAbstract;
    }

    @Override
    public boolean internare() {
        if(internareAbstract.internare())
        {
            System.out.println("Persoana se poate interna");
            return true;
        }else{
            System.out.println("Persoana nu se poate interna fara asigurare");
            return false;
        }
    }
}
