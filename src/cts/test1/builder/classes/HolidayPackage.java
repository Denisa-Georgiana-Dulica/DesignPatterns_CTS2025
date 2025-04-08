package cts.test1.builder.classes;

public class HolidayPackage implements AbstractHolidayPackage{
    private Transport transport;
    private Accommodation accommodation;
    private ExtraActivities extraActivities;
    private float price;

    HolidayPackage() {

    }

    @Override
    public String getTransportType() {
        return this.transport.getTransportType();
    }

    @Override
    public int getNightsOfAccommodation() {
        return this.accommodation.getNightsOfAccommodation();
    }

    @Override
    public int getHotelRanking() {
        return this.accommodation.getHotelRanking();
    }

    @Override
    public String[] getExtraActivities() {
        return extraActivities.getExtraActivities();
    }

    @Override
    public float getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "HolidayPackage{" +
                "transport=" + transport +
                ", accommodation=" + accommodation +
                ", extraActivities=" + extraActivities +
                ", price=" + price +
                '}';
    }

    public static class HolidayBuilder{
        private HolidayPackage holidayPackage=null;

        public HolidayBuilder() {
            this.holidayPackage = new HolidayPackage();
        }

        public HolidayBuilder addTransport(String transportType)
        {
            this.holidayPackage.transport=new Transport(transportType);
            return this;
        }

        public HolidayBuilder addAccomodation(int nightsOfAccommodation, int hotelRanking )
        {
            this.holidayPackage.accommodation=new Accommodation(nightsOfAccommodation,hotelRanking);
            return this;
        }

        public HolidayBuilder addExtraActivities(String[] activities)
        {
            this.holidayPackage.extraActivities=new ExtraActivities(activities);
            return this;
        }

        public HolidayPackage build()
        {
            HolidayPackage copy=holidayPackage;
            holidayPackage=new HolidayPackage();
            return copy;
        }

    }
}
