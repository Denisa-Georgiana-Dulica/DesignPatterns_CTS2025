package ctsCreationale.testCts.singletonRegistry.classes;

public class WeatherServiceWeb implements ServiceConnection {
    private String version;

    //the constructor must be package-private to ensure that there is only a single instance
    WeatherServiceWeb() {
        this.version = "version-1";
    }

    @Override
    public void connect() {
        System.out.println("Weather service web is connected");
    }

    @Override
    public void display() {
        System.out.println("Version " + this.version);
    }
}
