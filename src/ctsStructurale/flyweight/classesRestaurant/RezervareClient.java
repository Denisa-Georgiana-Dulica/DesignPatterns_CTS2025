package ctsStructurale.flyweight.classesRestaurant;

public class RezervareClient implements RezervareMemorata{

    private final String nume;
    private final String nrTelefon;
    private final String email;

    public RezervareClient(String nume, String nrTelefon, String email) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.email = email;
    }

    public String getNume() {
        return nume;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void rezerva(RezervareContext rezervareContext) {
        System.out.println("Clientul: "+this.nume+" - rezervare pentru "+rezervareContext.getNrPersoane()+" persoane, la ora: "+rezervareContext.getOraRezervare());
    }
}
