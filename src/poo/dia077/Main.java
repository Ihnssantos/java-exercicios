package poo.dia077;

public class Main {
    static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente(12345, "Igor", 1000);

        Conta conta2 = new ContaCorrente(12345, "João", 500);

        conta2.exibirTipoConta();

        conta1.depositar(500);
        conta1.sacar(200);

        conta1.exibirDados();
    }
}
