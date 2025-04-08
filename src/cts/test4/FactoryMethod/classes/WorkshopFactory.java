package cts.test4.FactoryMethod.classes;

public class WorkshopFactory extends AbstractEventFactory{
    @Override
    public Event getEvent(String title) {
        return new Workshop(title);
    }
}
