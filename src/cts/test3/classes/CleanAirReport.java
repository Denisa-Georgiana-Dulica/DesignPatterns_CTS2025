package cts.test3.classes;

public class CleanAirReport implements AbstractAirQualityReport{
     CleanAirReport() {
    }

    @Override
    public void generateRaport() {
        System.out.println("Clean raport: the air is clean");
    }

}
