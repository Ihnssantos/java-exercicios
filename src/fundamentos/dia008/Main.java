package fundamentos.dia008;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Possui autorização? ");
        boolean autorizacao = scanner.nextBoolean();


        String validacao;

        if (idade >= 18 && autorizacao) {
            validacao = "Acesso permitido!";
        } else {
            validacao = "Acesso negado!";
        }


        System.out.println("==== CONTROLE DE ACESSO ====");

        System.out.println("");

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Autorizado: " + autorizacao);

        System.out.println("");

        System.out.println(validacao);

        System.out.println("");

        System.out.println("=============================");
    }
}
