package ctsComportamentale.test1.classes.chain;

public abstract class FazaSpalare {
    protected FazaSpalare urmatoareaFazeSpalare;

    public void seteazaFazaUrmatoare(FazaSpalare fazeSpalare)
    {
        this.urmatoareaFazeSpalare=fazeSpalare;
    }

    public abstract void executaFaza(AbstractAutoWashOptions option);
}
