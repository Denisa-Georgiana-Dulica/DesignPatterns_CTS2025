package ctsStructurale.proxy.classesSpital;

public class ProxyInternare implements AbstractInternare{
    private AbstractInternare abstractInternare;

    public ProxyInternare(AbstractInternare abstractInternare) {
        this.abstractInternare = abstractInternare;
    }

    @Override
    public boolean interneaza() {
        if(abstractInternare.interneaza()==true)
        {
            System.out.println("Internare-Are card de sanatate");
        }else
            System.out.println("Fara internare-Nu are card de sanatate");
        return abstractInternare.interneaza();
    }
}
