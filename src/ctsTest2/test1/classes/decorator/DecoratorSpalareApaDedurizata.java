package ctsTest2.test1.classes.decorator;

public class DecoratorSpalareApaDedurizata extends DecoratorSpalare{

    public DecoratorSpalareApaDedurizata(AbstractAutoWashOptions options) {
        super(options);
    }

    @Override
    public boolean isPrewashSelected() {
        boolean base= super.isPrewashSelected();
        if(base)
        {
            System.out.println("Spalare cu apa dedurizata");
        }
        return base;
    }

    @Override
    public boolean isBrushWashingSelected() {
        boolean base= super.isBrushWashingSelected();
        if(base)
        {
            System.out.println("Spalare cu apa dedurizata");
        }
        return base;
    }
}
