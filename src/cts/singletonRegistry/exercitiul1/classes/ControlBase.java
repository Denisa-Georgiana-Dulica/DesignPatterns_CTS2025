package cts.singletonRegistry.exercitiul1.classes;

public class ControlBase implements ServiceConnection{
    private String name;

     ControlBase() {
        this.name = "Base control 1";
    }

    @Override
    public void connect() {
        System.out.println("Base control is connected");
    }

    @Override
    public void display() {
        System.out.println("Name:" + this.name);
    }
}
