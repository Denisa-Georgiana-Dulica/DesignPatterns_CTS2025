package ctsCreationale.test3.simpleFactory.classes;

public class CleanAirReport implements AbstractAirQualityReport{
     CleanAirReport() {
    }

    @Override
    public void generateRaport() {
        System.out.println("Clean raport: the air is clean");
    }

}
