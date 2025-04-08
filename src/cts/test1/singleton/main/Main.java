package cts.test1.singleton.main;

import cts.test1.singleton.classes.AbstractTourismLicense;
import cts.test1.singleton.classes.LicenseAlreadySetException;
import cts.test1.singleton.classes.TourismLicense;

public class Main {
    public static void main(String[] args) {
        AbstractTourismLicense tourismLicense= TourismLicense.getInstance();
        System.out.println(tourismLicense.getLicenseNumber());
        tourismLicense.setLicenseNumber("2");//doesn t throw exception
        System.out.println(tourismLicense.getLicenseNumber());

        Thread t=new Thread(()->
        {
            try{
                TourismLicense.getInstance().setLicenseNumber("3");//throw exception
            }catch(LicenseAlreadySetException e)
            {
                System.out.println("Thread error:"+e);
            }
        });
        t.start();

        try {
            t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        AbstractTourismLicense tourismLicense3= TourismLicense.getInstance();
        System.out.println(tourismLicense==tourismLicense3);//true==> the same object

    }
}
