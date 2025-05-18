package ctsComportamentale.command.classes;

public class OrdinVanzare extends Ordin{

    private BrokerExecutant brokerExecutant;

    public OrdinVanzare(int nrActiuni, BrokerExecutant brokerExecutant) {
        super(nrActiuni);
        this.brokerExecutant = brokerExecutant;
    }

    @Override
    public void executa(int nrActiuni) {
        brokerExecutant.executaOrdin(nrActiuni);
    }
}
