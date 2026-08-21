package fundamentos.dia010;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = scanner.next();

        System.out.println("Digite a idade: ");
        int idade = scanner.nextInt();

        System.out.println("É VIP? ");
        boolean vip = scanner.nextBoolean();

        System.out.println("Possui ingresso?");
        boolean ingresso = scanner.nextBoolean();

        String validacao;

        if ((idade >= 18 && ingresso) || vip) {
            validacao = "Acesso permitido!";
        } else {
            validacao = "Acesso negado.";
        }

        System.out.println("Idade: " + idade);
        System.out.println("VIP: " + vip);
        System.out.println("Ingresso: " + ingresso);

        System.out.println("");

        System.out.println(validacao);
    }
}
