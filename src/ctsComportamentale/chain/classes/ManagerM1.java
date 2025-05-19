package ctsComportamentale.chain.classes;

public class ManagerM1 extends AprobatorBugete{

    public static final int BUGET_MAXIM = 2000;

    @Override
    public void aprobaBuget(float suma) {
        if(suma< BUGET_MAXIM)
        {
            System.out.println("Aproba buget");
        }else
        {
           if(urmatorulAprobator!=null)
           {
               urmatorulAprobator.aprobaBuget(suma);
           }else
           {
               System.out.println("BUGET RESPINS");
           }
        }

    }
}
