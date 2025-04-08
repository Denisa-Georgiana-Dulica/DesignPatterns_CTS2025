package cts.testCts.simpleFactory.classes;

public class RaportFactory {

    public FieldRaport getRaport(Situation situation)
    {
        switch (situation)
        {
            case Situation.INFORMATION -> {return new InformationRaport();}
            case Situation.WARNING -> {return new WarningRaport();}
            case Situation.ALERT -> {return new AlertRaport();}
            default -> {throw new IllegalArgumentException();}
        }
    }
}
