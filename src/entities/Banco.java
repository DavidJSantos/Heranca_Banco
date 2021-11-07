package entities;

public class Banco {
    private static int proxNum=1;
    private int numBanco;
    private String nomeBanco;

    public Banco() {
        this.numBanco = proxNum++;
    }

    public Banco(String nomeBanco) {
        this.numBanco = proxNum++;
        this.nomeBanco = nomeBanco;
    }

    public int getNumBanco() {
        return numBanco;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }
}
