package poo.dia069;

public class Main {
    static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria(12345, "Igor", 1000.0);

        System.out.println("Numero: " + conta1.getNumero());
        System.out.println("Titular: " + conta1.getTitular());
        System.out.println("Saldo: " + conta1.getSaldo());

        conta1.setTitular("João");

        System.out.println("");

        System.out.println("Numero: " + conta1.getNumero());
        System.out.println("Titular: " + conta1.getTitular());
        System.out.println("Saldo: " + conta1.getSaldo());
    }
}
