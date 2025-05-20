package ctsTest2.test1.classes.decorator;

public class DecoratorSpalareSasiu extends DecoratorSpalare{

    public DecoratorSpalareSasiu(AbstractAutoWashOptions options) {
        super(options);
    }

    @Override
    public boolean isPrewashSelected() {
        boolean base= super.isPrewashSelected();
        if(base)
        {
            System.out.println("Spala si sasiul");
        }
        return base;
    }
}
