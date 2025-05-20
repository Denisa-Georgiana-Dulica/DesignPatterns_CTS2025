package ctsComportamentale.test1.classes.chain;

public class FazaPeriere extends FazaSpalare{

    @Override
    public void executaFaza(AbstractAutoWashOptions option) {
        if(option.isBrushWashingSelected())
        {
            System.out.println("Faza periere");
        }
        if(urmatoareaFazeSpalare!=null)
        {
            urmatoareaFazeSpalare.executaFaza(option);
        }
    }
}
