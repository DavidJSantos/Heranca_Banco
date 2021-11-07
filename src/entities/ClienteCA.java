package entities;

public class ClienteCA extends Cliente{
    private double taxaRendimento;

    public ClienteCA(Banco banco){
        super(banco);
    }

    public void imprimeExtrato() {
        System.out.println("--- Extrato Conta Poupanca ---");
        super.imprimirDados();
        System.out.println("Taxa de rendimento: " + taxaRendimento + " % Mes");
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
}
