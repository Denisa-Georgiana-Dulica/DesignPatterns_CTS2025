package ctsCreationale.test1.builder.classes;

public class Accommodation {
    private int nightsOfAccommodation;
    private int hotelRanking;

    Accommodation(int nightsOfAccommodation, int hotelRanking) {
        this.nightsOfAccommodation = nightsOfAccommodation;
        this.hotelRanking = hotelRanking;
    }

    public int getNightsOfAccommodation() {
        return nightsOfAccommodation;
    }

    public int getHotelRanking() {
        return hotelRanking;
    }

    @Override
    public String toString() {
        return "Accommodation{" +
                "nightsOfAccommodation=" + nightsOfAccommodation +
                ", hotelRanking=" + hotelRanking +
                '}';
    }
}
