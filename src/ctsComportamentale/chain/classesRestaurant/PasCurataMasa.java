package ctsComportamentale.chain.classesRestaurant;

public class PasCurataMasa extends PasOcupareMasa{

    @Override
    public void executaPas(Masa masa) {
        if(!masa.isEsteCuratata())//false
        {
            System.out.println("Curata masa");
            masa.setEsteCuratata(true);
            if (urmatorulPas!=null)
            {
                urmatorulPas.executaPas(masa);
            }else{
                System.out.println("Nu se poate pregati masa");
            }
        }
    }
}
