package program;

import entities.Banco;
import entities.Cliente;
import entities.ClienteCA;
import entities.ClienteCC;

public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco("Itau");
        Banco banco2 = new Banco("Inter");

        ClienteCC cliente1 = new ClienteCC(banco);
        ClienteCA cliente2 = new ClienteCA(banco2);

        cliente1.setNome("Negan");
        cliente1.setNumAgencia(123);
        cliente1.setNumConta(22222);
        cliente1.setTipo(Cliente.TipoConta.C);
        cliente1.setSaldo(2000);
        cliente1.setLimite(3000);
        cliente1.setTaxaJuros(6);

        cliente2.setNome("Rick");
        cliente2.setNumAgencia(231);
        cliente2.setNumConta(333333);
        cliente2.setTipo(Cliente.TipoConta.P);
        cliente2.setSaldo(3000);
        cliente2.setTaxaRendimento(2.5);

        cliente1.imprimeExtrato();
        System.out.println();
        cliente2.imprimeExtrato();
    }
}
