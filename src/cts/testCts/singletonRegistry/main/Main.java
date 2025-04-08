package cts.testCts.singletonRegistry.main;

import cts.testCts.singletonRegistry.classes.DroneConnection;
import cts.testCts.singletonRegistry.classes.ServiceConnection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        DroneConnection droneConnection=new DroneConnection();
        ServiceConnection gpsSatellite1=droneConnection.getConnection(DroneConnection.GPS_SATELLITE);
        gpsSatellite1.connect();
        gpsSatellite1.display();
        ServiceConnection gpsSatellite2=droneConnection.getConnection(DroneConnection.GPS_SATELLITE);
        gpsSatellite2.connect();
        gpsSatellite2.display();
        ServiceConnection weatherService=droneConnection.getConnection(DroneConnection.WEATHER_SERVICE);
        weatherService.display();
        ServiceConnection baseControl=droneConnection.getConnection(DroneConnection.CONTROL_BASE);
        baseControl.display();

        System.out.println(gpsSatellite1==gpsSatellite2); //true==> the same object
    }
}