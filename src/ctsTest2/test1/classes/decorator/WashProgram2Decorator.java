package ctsTest2.test1.classes.decorator;

public class WashProgram2Decorator implements AbstractAutoWashOptions {

    @Override
    public boolean isPrewashSelected() {
        return true;
    }

    @Override
    public boolean isBrushWashingSelected() {
        return true;
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
