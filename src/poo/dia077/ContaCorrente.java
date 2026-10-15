package poo.dia077;

public class ContaCorrente extends Conta implements OperacaoBancaria {

    public ContaCorrente(int numero, String nome, double saldo) {
        super(numero, nome, saldo);
    }

    @Override
    public void exibirTipoConta() {
        System.out.println("Conta Corrente");
    }

    @Override
    public void exibirDados() {
        System.out.println(getNumero());
        System.out.println(getNome());
        System.out.println(getSaldo());
    }
}
