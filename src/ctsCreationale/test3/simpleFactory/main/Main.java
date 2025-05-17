package ctsCreationale.test3.simpleFactory.main;

import ctsCreationale.test3.simpleFactory.classes.AbstractAirQualityReport;
import ctsCreationale.test3.simpleFactory.classes.SimpleFactory;

public class Main {
    public static void main(String[] args) {
        SimpleFactory simpleFactory=new SimpleFactory();
        AbstractAirQualityReport report=simpleFactory.getReport(30);
        report.generateRaport();
        AbstractAirQualityReport report2=simpleFactory.getReport(90);
        report2.generateRaport();
    }
}
