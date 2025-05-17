package ctsCreationale.test1.singleton.classes;

public class TourismLicense implements AbstractTourismLicense{
    private static TourismLicense instance=null;
    private String licenceNumber;
    private boolean isSet=false;

    TourismLicense() {
        this.licenceNumber="1";
    }

    public static TourismLicense getInstance()
    {
        if(instance==null)
        {
            synchronized (TourismLicense.class)
            {
                if(instance==null)
                {
                    instance=new TourismLicense();
                }
            }
        }
        return instance;
    }

    //must allow the license to be modified only once
    @Override
    public void setLicenseNumber(String number) {
        if(isSet)
        {
            throw new LicenseAlreadySetException();
        }
        this.licenceNumber=number;
        isSet=true;
    }

    @Override
    public String getLicenseNumber() {
        return licenceNumber;
    }
}
