package ctsComportamentale.command.classesSpital;

public class MedicExecutant {
    public void executaComada(String nume)
    {
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
        System.out.println("S-a executat comanda pentru "+nume);
    }
}
