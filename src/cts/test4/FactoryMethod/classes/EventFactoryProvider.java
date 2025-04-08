package cts.test4.FactoryMethod.classes;

public class EventFactoryProvider {

    public Event getEvent(TypeEvents typeEvents,String title)
    {
        switch (typeEvents)
        {
            case WEBINAR -> {return new WebinarFactory().getEvent(title);}
            case WORKSHOP -> {return new WorkshopFactory().getEvent(title);}
            case CONFERENCE -> {return new ConferenceFactory().getEvent(title);}
            default -> throw new IllegalArgumentException();
        }
    }
}
