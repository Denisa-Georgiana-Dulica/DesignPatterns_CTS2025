package cts.test4.FactoryMethod.classes;

import cts.test2.factoryMethod.classes.AbstractFactory;

public class WebinarFactory extends AbstractEventFactory {

    @Override
    public Event getEvent(String title) {
        return new Webinar(title);
    }
}
