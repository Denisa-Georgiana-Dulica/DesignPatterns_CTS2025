package ctsComportamentale.chain.classesRestaurant;

public class PasAseazaServetele extends PasOcupareMasa{

    @Override
    public void executaPas(Masa masa) {
        if(!masa.isEsteCuratata())
        {
            System.out.println("Nu pot așeza șervețelele: masa NU este curățată");
        }else {
            if(!masa.isAreServetele())
            {
                System.out.println("Aseaza servetelele");
                masa.setAreServetele(true);
                if(urmatorulPas!=null)
                {
                    urmatorulPas.executaPas(masa);
                }else{
                    System.out.println("Nu se poate pregati masa");
                }
            }
        }

    }
}
