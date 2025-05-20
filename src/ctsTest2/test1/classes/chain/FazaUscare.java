package ctsTest2.test1.classes.chain;

public class FazaUscare extends FazaSpalare{

    @Override
    public void executaFaza(AbstractAutoWashOptions option) {
        if(option.isDryingSelected())
        {
            System.out.println("Faza uscare");
        }
        if(urmatoareaFazeSpalare!=null)
        {
            urmatoareaFazeSpalare.executaFaza(option);
        }
    }
}
