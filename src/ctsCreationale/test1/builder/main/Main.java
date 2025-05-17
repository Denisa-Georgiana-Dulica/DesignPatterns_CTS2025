package ctsCreationale.test1.builder.main;

import ctsCreationale.test1.builder.classes.HolidayPackage;

public class Main {
    public static void main(String[] args) {
        HolidayPackage.HolidayBuilder holidayBuilder = new HolidayPackage.HolidayBuilder();
        String[] activities = new String[]{"tennis", "swim"};
        HolidayPackage holidayPackage = holidayBuilder.addTransport("airplane").addAccomodation(2, 5).build();
        System.out.println(holidayPackage.toString());
        HolidayPackage holidayPackage2 = holidayBuilder.addTransport("bus").addExtraActivities(activities).build();
        System.out.println(holidayPackage2.toString());
        HolidayPackage holidayPackage3=holidayBuilder.addAccomodation(3,4).addExtraActivities(activities).build();
        System.out.println(holidayPackage3.toString());

    }
}
