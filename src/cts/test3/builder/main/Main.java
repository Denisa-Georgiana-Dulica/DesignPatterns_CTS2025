package cts.test3.builder.main;

import cts.test3.builder.classes.AbstractAirQualitySensor;
import cts.test3.builder.classes.Sensor;

public class Main {
    public static void main(String[] args) {
        Sensor.SensorBuilder sensorBuilder=new Sensor.SensorBuilder();
        AbstractAirQualitySensor sensor=sensorBuilder.addHumidity(20).addLevelPm10(20).build();
        System.out.println(sensor.toString());

        AbstractAirQualitySensor sensor2=sensorBuilder.addTemperature(30).addLevelPm10(5).build();
        System.out.println(sensor2.toString());

        AbstractAirQualitySensor sensor3=sensorBuilder.addLevelPm25(2).addHumidity(40).build();
        System.out.println(sensor3.toString());


    }
}
