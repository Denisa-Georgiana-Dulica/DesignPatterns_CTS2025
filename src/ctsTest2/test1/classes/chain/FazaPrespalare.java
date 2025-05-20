package ctsTest2.test1.classes.chain;

public class FazaPrespalare extends FazaSpalare{

    @Override
    public void executaFaza(AbstractAutoWashOptions option) {
        if(option.isPrewashSelected())
        {
            System.out.println("Faza prespalare");
        }
        if(urmatoareaFazeSpalare!=null)
        {
            urmatoareaFazeSpalare.executaFaza(option);
        }
    }
}
