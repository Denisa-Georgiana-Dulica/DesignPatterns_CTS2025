package cts.testCts.simpleFactory.classes;

public class WarningRaport implements FieldRaport{
    WarningRaport() {
    }

    @Override
    public void showSituation() {
        System.out.println("Warning raport: Warning!");
    }
}
