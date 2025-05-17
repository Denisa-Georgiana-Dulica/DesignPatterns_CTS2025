package ctsCreationale.testCts.singletonRegistry.classes;

import java.util.HashMap;
import java.util.Map;

public class DroneConnection {
    private static Map<String, ServiceConnection> collection = new HashMap<>();

    public static final String CONTROL_BASE = "ControlBase";

    public static final String GPS_SATELLITE = "GpsSatellite";

    public static final String WEATHER_SERVICE = "WeatherService";

    //we load the map when the application loads
    static {
        collection.put(CONTROL_BASE, new ControlBase());
        collection.put(GPS_SATELLITE, new GpsSatellite());
        collection.put(WEATHER_SERVICE, new WeatherServiceWeb());
    }

    public ServiceConnection getConnection(String connection) {
        if (collection.containsKey(connection)) {
            return collection.get(connection);
        } else {
            throw new IllegalArgumentException();
        }
    }

}
