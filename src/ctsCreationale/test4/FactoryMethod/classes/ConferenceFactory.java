package ctsCreationale.test4.FactoryMethod.classes;

public class ConferenceFactory extends AbstractEventFactory{

    @Override
    public Event getEvent(String title) {
        return new Conference(title);
    }
}
