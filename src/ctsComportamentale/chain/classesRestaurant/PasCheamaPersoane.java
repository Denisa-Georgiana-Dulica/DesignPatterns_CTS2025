package ctsComportamentale.chain.classesRestaurant;

public class PasCheamaPersoane extends PasOcupareMasa{

    @Override
    public void executaPas(Masa masa) {
        if(!masa.isAreTacamuri())
        {
            System.out.println("Nu se pot chema persoanele pentru ca nu s-au asezat tacamurile");
        }else{
            System.out.println("Cheama persoanele la masa");
        }

    }
}
