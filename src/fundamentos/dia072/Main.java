package fundamentos.dia072;

public class Main {
    static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria("Igor", 1001, 1500.0);
        ContaBancaria conta2 = new ContaBancaria("Maria", 1002, 3000.0);

        System.out.println("=== CONTA 1 ===");
        System.out.println("Titular: " + conta1.getTitular());
        System.out.println("Número: " + conta1.getNumero());
        System.out.println("Saldo: R$ " + conta1.getSaldo());

        System.out.println("");

        System.out.println("=== CONTA 2 ===");
        System.out.println("Titular: " + conta2.getTitular());
        System.out.println("Número: " + conta2.getNumero());
        System.out.println("Saldo: R$ " + conta2.getSaldo());

        System.out.println("");

        conta1.setSaldo(2000.0);

        System.out.println("=== SALDO ATUALIZADO ===");
        System.out.println("Titular: " + conta1.getTitular());
        System.out.println("Novo saldo: " + conta1.getSaldo());
    }
}
