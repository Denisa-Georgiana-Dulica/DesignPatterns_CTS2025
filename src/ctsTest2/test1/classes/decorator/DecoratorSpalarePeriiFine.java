package ctsTest2.test1.classes.decorator;

public class DecoratorSpalarePeriiFine extends DecoratorSpalare{

    public DecoratorSpalarePeriiFine(AbstractAutoWashOptions options) {
        super(options);
    }

    @Override
    public boolean isBrushWashingSelected() {
        boolean base= super.isBrushWashingSelected();
        if(base)
        {
            System.out.println("Spalare cu perii fine");
        }
        return base;
    }

}
