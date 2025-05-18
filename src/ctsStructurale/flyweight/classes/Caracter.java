package ctsStructurale.flyweight.classes;

public class Caracter implements CaracterPrintabil{

    private final String caracter; //stare permanenta

    public Caracter(String caracter) {
        this.caracter = caracter;
    }

    public String getCaracter() {
        return caracter;
    }

    @Override
    public void printeaza(CaracterContext caracterContext) {
        System.out.println(this.caracter+" pe pozitia "+caracterContext.getPozitie());
    }
}
