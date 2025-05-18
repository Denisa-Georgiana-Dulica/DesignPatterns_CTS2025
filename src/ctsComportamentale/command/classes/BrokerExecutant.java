package ctsComportamentale.command.classes;

public class BrokerExecutant {
    public void executaOrdin(int nrActiuni)
    {
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
        System.out.println("S-a executat ordinul");
    }
}
