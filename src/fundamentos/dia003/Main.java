package fundamentos.dia003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o código do produto: ");
        int codigo = scanner.nextInt();

        System.out.println("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.println("Digite a quantidade em estoque: ");
        int quantidade = scanner.nextInt();

        System.out.println("O produto está disponível? ");
        boolean disponivel = scanner.nextBoolean();

        System.out.println("==== PRODUTO CADASTRADO ====");

        System.out.println("");

        System.out.println("Nome: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
        System.out.println("Disponível: " + disponivel);

        System.out.println("");

        System.out.println("===============================");

        System.out.println("Produto cadastrado com sucesso!");

        scanner.close();
    }
}
