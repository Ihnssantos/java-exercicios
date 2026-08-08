package fundamentos.dia001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite a cidade que você mora: ");
        String cidade = scanner.next();

        System.out.println("Digite sua profissão: ");
        String profissao = scanner.next();

        System.out.println("===== DADOS CADASTRADOS ====");

        System.out.println("");

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cidade: " + cidade);
        System.out.println("Profissão: " + profissao);

        System.out.println("");

        System.out.println("=============================");

        scanner.close();
    }
}