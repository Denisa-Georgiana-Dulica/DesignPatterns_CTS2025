package ctsComportamentale.chain.classesRestaurant;

public class PasAseazaTacamuri extends PasOcupareMasa{

    @Override
    public void executaPas(Masa masa) {
        if(!masa.isAreServetele())
        {
            System.out.println("Nu se pot aseza tacamurile pemtru ca servetelele nu s-au asezat");
        }else{
            if(!masa.isAreTacamuri())
            {
                System.out.println("Aseaza tacamuri");
                masa.setAreTacamuri(true);
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
