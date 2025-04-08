package cts.testCts.simpleFactory.classes;

public class InformationRaport implements FieldRaport{
    InformationRaport() {
    }

    @Override
    public void showSituation() {
        System.out.println("Information raport: Show the information");
    }
}
