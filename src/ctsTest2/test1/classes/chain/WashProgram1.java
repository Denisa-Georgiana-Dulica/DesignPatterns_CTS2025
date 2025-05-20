package ctsComportamentale.test1.classes.chain;

public class WashProgram1 implements AbstractAutoWashOptions{

    @Override
    public boolean isPrewashSelected() {
        return true;
    }

    @Override
    public boolean isBrushWashingSelected() {
        return false;
    }

    @Override
    public boolean isWaxAndPolishSelected() {
        return true;
    }

    @Override
    public boolean isDryingSelected() {
        return false;
    }
}
