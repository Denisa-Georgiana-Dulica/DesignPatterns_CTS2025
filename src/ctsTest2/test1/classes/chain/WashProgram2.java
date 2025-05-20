package ctsTest2.test1.classes.chain;

public class WashProgram2 implements AbstractAutoWashOptions{

    @Override
    public boolean isPrewashSelected() {
        return false;
    }

    @Override
    public boolean isBrushWashingSelected() {
        return true;
    }

    @Override
    public boolean isWaxAndPolishSelected() {
        return false;
    }

    @Override
    public boolean isDryingSelected() {
        return true;
    }
}
