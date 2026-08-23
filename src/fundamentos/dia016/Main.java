package fundamentos.dia016;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==== MENU ====");

        System.out.println("");

        System.out.println("1 - Cadastrar usuário");
        System.out.println("2 - Consultar usuário");
        System.out.println("3 - Atualizar usuário");
        System.out.println("4 - Sair");

        System.out.println("");

        System.out.println("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Opção escolhida: Cadastrar usuário");
                break;

            case 2:
                System.out.println("Opção escolhida: Consultar usuário");
                break;

            case 3:
                System.out.println("Opção escolhida: Atualizar usuário");
                break;

            case 4:
                System.out.println("Encerrando o sistema...");
                break;

            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
