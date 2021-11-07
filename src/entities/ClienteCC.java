package entities;

public class ClienteCC extends Cliente{

    private double limite;
    private double taxaJuros;

    public ClienteCC(Banco banco){
        super(banco);
    }

    public void imprimeExtrato() {
        System.out.println("--- Extrato Conta Corrente ---");
        super.imprimirDados();
        System.out.printf("Limite: %.2f%n", limite);
        System.out.println("Taxa de juros: " + taxaJuros + " % Mes");
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }



}
