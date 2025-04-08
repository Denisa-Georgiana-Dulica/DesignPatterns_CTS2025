package cts.testCts.simpleFactory.classes;

public class AlertRaport implements FieldRaport{
    AlertRaport() {
    }

    @Override
    public void showSituation() {
        System.out.println("Alert raport: It s an emergency");
    }
}
