package entities;

public class Cliente {

    public enum TipoConta {C, P}

    protected Banco banco;
    protected int numAgencia;
    protected int numConta;
    protected String nome;
    protected double saldo;
    protected TipoConta tipo;

    public Cliente(Banco banco) {
        this.banco = banco;
    }

    public void imprimirDados(){
        String aux;
        System.out.println("Nome do banco: " + banco.getNomeBanco());
        System.out.println("Numero do banco: " + banco.getNumBanco());
        System.out.println("Numero da agencia: " + numAgencia);
        System.out.println("Numero da conta: " + numConta);
        System.out.println("Nome do Cliente: " + nome);
        System.out.printf("Saldo: R$ %.2f%n" ,saldo);
        if (tipo == TipoConta.C) {
            System.out.println("Tipo da conta: Corrente");
        }else {
            System.out.println("Tipo da conta: Poupanca");
        }
    }

    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }


    public void setTipo(TipoConta tipo) {
        this.tipo = tipo;
    }
}
