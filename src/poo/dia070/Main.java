package poo.dia070;

public class Main {
    static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria(1, "Igor", 1000);


        System.out.println(conta1.getSaldo()); //1000.0

        conta1.depositar(500);

        System.out.println(conta1.getSaldo()); //1500.0

        conta1.sacar(300);

        System.out.println(conta1.getSaldo()); //1200.0
    }
}
