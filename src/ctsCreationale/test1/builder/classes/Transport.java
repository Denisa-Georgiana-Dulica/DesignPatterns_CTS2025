package ctsCreationale.test1.builder.classes;

public class Transport {
    private String transportType;

    Transport(String transportType) {
        this.transportType = transportType;
    }

    public String getTransportType() {
        return transportType;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "transportType='" + transportType + '\'' +
                '}';
    }
}
