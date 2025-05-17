package ctsCreationale.test3.simpleFactory.classes;

public class HealthRiskRaport implements AbstractAirQualityReport{

    HealthRiskRaport() {
    }

    @Override
    public void generateRaport() {
        System.out.println("HealthRiskRaport: the air is dangerous for health.");
    }

}
