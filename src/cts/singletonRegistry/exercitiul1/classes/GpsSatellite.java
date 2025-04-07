package cts.singletonRegistry.exercitiul1.classes;

public class GpsSatellite implements ServiceConnection {
    private String type;

    GpsSatellite() {
        this.type = "GPS 1";
    }

    @Override
    public void connect() {
        System.out.println("GPS satellite is connected");
    }

    @Override
    public void display() {
        System.out.println("Type:" + this.type);
    }
}
