package pratica.dia003;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas vendas serão registradas?");
        int quantidadeVendas = scanner.nextInt();

        double valorVenda;
        int quantidadeAcima500 = 0;
        double total = 0;
        double maiorVenda = 0;


        for (int i = 1; i <= quantidadeVendas; i++) {
            valorVenda = scanner.nextDouble();
            total += valorVenda;

            if (valorVenda > 500) {
                quantidadeAcima500++;
            }

            if (valorVenda > maiorVenda) {
                maiorVenda = valorVenda;
            }
        }

        System.out.println("=== RESUMO ===");
        System.out.println("Quantidade de vendas: " + quantidadeVendas);
        System.out.println("Total vendido: R$ " + total);
        System.out.println("Vendas acima de R$ 500: " + quantidadeAcima500);
        System.out.println("Maior venda: R$" + maiorVenda);


    }
}
