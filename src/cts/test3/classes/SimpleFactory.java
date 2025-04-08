package cts.test3.classes;

public class SimpleFactory {
    public AbstractAirQualityReport getReport(double valuePm)
    {
        if(valuePm>=0 && valuePm<=30)
        {
            return new CleanAirReport();
        }else if(valuePm>=31 && valuePm<=70)
        {
            return new WarningReport();
        }else if(valuePm>=71)
        {
            return new HealthRiskRaport();
        }
        else
            throw new IllegalArgumentException("The value don t have a valid value.");
    }
}
