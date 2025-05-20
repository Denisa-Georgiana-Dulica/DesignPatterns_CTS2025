package ctsComportamentale.test1.classes.chain;

public class FazaCeruire extends FazaSpalare{

    @Override
    public void executaFaza(AbstractAutoWashOptions option) {
        if(option.isWaxAndPolishSelected())
        {
            System.out.println("Faza de ceruire si polish");
        }
        if(urmatoareaFazeSpalare!=null)
        {
            urmatoareaFazeSpalare.executaFaza(option);
        }
    }
}
