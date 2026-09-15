package pratica.dia001;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //ENTRADA DOS DADOS
        System.out.println("Digite o nome do cliente: ");
        String nome = scanner.next();

        System.out.println("Digite o nome do produto: ");
        String produto = scanner.next();

        System.out.println("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.println("Digite a quantidade do produto: ");
        int quantidade = scanner.nextInt();

        System.out.println("Dinheiro disponível: ");
        double dinheiro = scanner.nextDouble();


        //VALOR TOTAL DA COMPRA
        double total = preco * quantidade;

        //QUANTO SOBRA SE A COMPRA FOR APROVADA
        double saldoRestante = dinheiro - total;

        //QUANTO FALTA SE A COMPRA NÃO PUDER SER REALIZADA
        double valorFaltante = total - dinheiro;


        System.out.println("Nome: " + nome);
        System.out.println("Produto: " + produto);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Dinheiro disponível: " + dinheiro);

        System.out.println("");

        System.out.println("Total: " + total);

        if (total <= dinheiro) {
            System.out.println("Compra aprovada!");
            System.out.println("Saldo restante: " + "R$ " + saldoRestante);
        } else {
            System.out.println("Compra recusada!");
            System.out.println("Faltam: " + "R$ " + valorFaltante);
        }
    }
}
