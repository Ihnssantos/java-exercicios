package fundamentos.dia005;

import java.util.Scanner;

public class Main {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nome = scanner.next();

        System.out.println("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.println("Digite a quantidade: ");
        int quantidade = scanner.nextInt();

        double total = preco * quantidade;

        double desconto = total * 0.10;

        double valorFinal = total - desconto;

        System.out.println("==== RESUMO DA COMPRA ====");

        System.out.println("");

        System.out.println("Produto: " + nome);
        System.out.println("Preço unitário: " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Total: " + total);
        System.out.printf("Desconto: %.2f%n", desconto);
        System.out.println("Valor final: " + valorFinal);

        System.out.println("");

        System.out.println("===========================");
        System.out.println("Compra realizada com sucesso!");
    }
}