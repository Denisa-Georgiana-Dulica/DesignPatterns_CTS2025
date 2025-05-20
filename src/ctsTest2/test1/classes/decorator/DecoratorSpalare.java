package ctsTest2.test1.classes.decorator;

public class DecoratorSpalare implements AbstractAutoWashOptions{
    private AbstractAutoWashOptions options;

    public DecoratorSpalare(AbstractAutoWashOptions options) {
        this.options = options;
    }

    @Override
    public boolean isPrewashSelected() {
        boolean value = options.isPrewashSelected();
        if (value) {
            System.out.println("→ Execut prespalare");
        }
        return value;
    }

    @Override
    public boolean isBrushWashingSelected() {
        boolean value = options.isBrushWashingSelected();
        if (value) {
            System.out.println("→ Execut spalare cu perii");
        }
        return value;
    }

    @Override
    public boolean isWaxAndPolishSelected() {
        boolean value = options.isWaxAndPolishSelected();
        if (value) {
            System.out.println("→ Execut ceruire si polish");
        }
        return value;
    }

    @Override
    public boolean isDryingSelected() {
        boolean value = options.isDryingSelected();
        if (value) {
            System.out.println("→ Execut uscare");
        }
        return value;
    }
}
