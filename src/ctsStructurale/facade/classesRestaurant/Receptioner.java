package ctsStructurale.facade.classesRestaurant;

public class Receptioner {

    public void verificaMasa(Masa masa)
    {
        Ospatar ospatar;
        Picollo picollo;
        if(masa.isEsteLibera())
        {
            if(picollo.esteDebarasata(masa))
            {
                if (ospatar.esteAranjata(masa))
                {
                    System.out.println("Luati loc la masa "+masa.getNrMasa());
                }else{
                    System.out.println("Masa nu e aranjata");
                }
            }else{
                System.out.println("Masa nu e debarasata");
            }
        }else{
            System.out.println("Masa nu e libera");
        }
    }

}
