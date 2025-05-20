package ctsTest2.test1.classes.decorator;

public class WashProgramDecorator implements AbstractAutoWashOptions {

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
