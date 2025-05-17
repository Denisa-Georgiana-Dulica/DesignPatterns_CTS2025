package ctsCreationale.test4.FactoryMethod.main;

import ctsCreationale.test4.FactoryMethod.classes.*;

public class Main {
    public static void main(String[] args) {
        EventFactoryProvider eventFactoryProvider=new EventFactoryProvider();
        Event event1=eventFactoryProvider.getEvent(TypeEvents.CONFERENCE,"business");
        System.out.println(event1.toString());

        Event event2=eventFactoryProvider.getEvent(TypeEvents.WEBINAR,"life style");
        System.out.println(event2.toString());

        Event event3=eventFactoryProvider.getEvent(TypeEvents.WORKSHOP,"JAVA");
        System.out.println(event3.toString());
    }
}
