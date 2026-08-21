package fundamentos.dia011;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = scanner.next();

        System.out.println("Digite a idade: ");
        int idade = scanner.nextInt();

        String classificacao;


        if (idade <= 12) {
            classificacao = "Criança";
        } else if (idade <= 17) {
            classificacao = "Adolescente";
        } else if (idade <= 59) {
            classificacao = "Adulto";
        } else {
            classificacao = "Idoso";
        }

        System.out.println("==== CLASSIFICAÇÃO ====");

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Classificação: " + classificacao);

        System.out.println("=========================");
    }
}
