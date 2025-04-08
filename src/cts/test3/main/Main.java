package cts.test3.main;

import cts.test3.classes.AbstractAirQualityReport;
import cts.test3.classes.SimpleFactory;

public class Main {
    public static void main(String[] args) {
        SimpleFactory simpleFactory=new SimpleFactory();
        AbstractAirQualityReport report=simpleFactory.getReport(30);
        report.generateRaport();
        AbstractAirQualityReport report2=simpleFactory.getReport(90);
        report2.generateRaport();
    }
}
