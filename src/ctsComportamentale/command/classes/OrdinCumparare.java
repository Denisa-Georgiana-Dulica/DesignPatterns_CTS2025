package ctsComportamentale.command.classes;

public class OrdinCumparare extends Ordin{
    private BrokerExecutant brokerExecutant;

    public OrdinCumparare(int nrActiuni, BrokerExecutant brokerExecutant) {
        super(nrActiuni);
        this.brokerExecutant = brokerExecutant;
    }

    @Override
    public void executa(int nrActiuni) {
        brokerExecutant.executaOrdin(nrActiuni);
    }
}
