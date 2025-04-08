package cts.test3.simpleFactory.classes;

public class WarningReport implements AbstractAirQualityReport{
    WarningReport() {
    }

    @Override
    public void generateRaport() {
        System.out.println("Warning raport: The air isn't clean. ");
    }
}
