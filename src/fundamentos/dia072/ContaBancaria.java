package fundamentos.dia072;

public class ContaBancaria {

    //ATRIBUTO
    private String titular;
    private int numero;
    private double saldo;

    //CONSTRUTOR
    public ContaBancaria(String titular, int numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    //GETERS
    public String getTitular() {
        return titular;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    //SETERS
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
