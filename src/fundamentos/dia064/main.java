package fundamentos.dia064;

import java.util.Scanner;

public class main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //VARIAVEIS
        double total = 0;
        int vendaMais = 0;
        int vendaMenos = 0;
        double maiorVenda = 0;
        double menorVenda = 0;

        //QUANTIDADE
        System.out.println("Digite a quantidade de vendas realizadas: ");
        int quantidade = scanner.nextInt();

        //ANALISE
        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Digite o valor da venda " + i + ": ");
            double venda = scanner.nextDouble();

            total += venda;

            if (venda >= 100) {
                vendaMais++;
            } else {
                vendaMenos++;
            }

            if (i == 1) {
                maiorVenda = venda;
                menorVenda = venda;
            }

            if (venda > maiorVenda) {
                maiorVenda = venda;
            }

            if (venda < menorVenda) {
                menorVenda = venda;
            }

        }

        //MEDIA
        double mediaVenda = total / quantidade;


        //RESULTADO
        System.out.println("");

        System.out.println("=== RESULTADO ===");
        System.out.println("Total vendido: " + total);
        System.out.println("Vendas de R$ 100 ou mais: " + vendaMais);
        System.out.println("Vendas abaixo de R$ 100: " + vendaMenos);
        System.out.println("Maior venda: " + maiorVenda);
        System.out.println("Menor venda: " + menorVenda);
        System.out.println("Média das vendas: " + mediaVenda);


    }
}
