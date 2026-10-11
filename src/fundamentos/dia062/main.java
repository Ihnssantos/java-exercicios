package fundamentos.dia062;

import java.util.Scanner;

public class main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o preço: ");
        double preco = scanner.nextDouble();

        System.out.println("Digite a quantidade: ");
        int quantidade = scanner.nextInt();

        System.out.println("Saldo disponível: ");
        double saldo = scanner.nextDouble();

        double valorTotal = preco * quantidade;
        double saldoRestante = saldo - valorTotal;
        boolean saldoSuficiente = valorTotal <= saldo;
        boolean compraGrande = valorTotal > 100 && quantidade >= 3;

        System.out.println("");

        System.out.println("=== ANÁLISE DE COMPRA ===");
        System.out.println("Produto: " + nome);
        System.out.println("Preço unitário: " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Total: " + valorTotal);
        System.out.println("Dinheiro disponível: " + saldo);
        System.out.println("Restante: " + saldoRestante);
        System.out.println("Compra possível: " + saldoSuficiente);
        System.out.println("Compra grande: " + compraGrande);
    }
}
