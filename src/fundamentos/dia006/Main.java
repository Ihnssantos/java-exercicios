package fundamentos.dia006;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do cliente: ");
        String nome = scanner.next();

        System.out.println("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        System.out.println("Digite o valor disponível: ");
        double valorDisponivel = scanner.nextDouble();

        double saldoRestante = valorDisponivel - valorCompra;

        if (valorDisponivel >= valorCompra) {
            System.out.println("==== ANÁLISE DA COMPRA ====");

            System.out.println("");

            System.out.println("Cliente: " + nome);
            System.out.println("Valor da compra: " + valorCompra);
            System.out.println("Valor disponivel: " + valorDisponivel);

            System.out.println("");

            System.out.println("Compra aprovada!");
            System.out.println("Saldo restante: " + saldoRestante);

            System.out.println("");

            System.out.println("==============================");

        } else {

            System.out.println("==== ANÁLISE DA COMPRA ====");

            System.out.println("");

            System.out.println("Cliente: " + nome);
            System.out.println("Valor da compra: " + valorCompra);
            System.out.println("Valor disponivel: " + valorDisponivel);

            System.out.println("");

            System.out.println("Compra recusada!");
            System.out.println("Saldo insuficiente.");

            System.out.println("");

            System.out.println("==============================");
        }
    }
}
