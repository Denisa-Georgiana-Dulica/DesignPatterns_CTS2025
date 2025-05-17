package ctsCreationale.test4.FactoryMethod.classes;

public class WebinarFactory extends AbstractEventFactory {

    @Override
    public Event getEvent(String title) {
        return new Webinar(title);
    }
}
