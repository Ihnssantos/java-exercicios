package fundamentos.dia017;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Atendimento ====");

        System.out.println("");

        System.out.println("1 - Suporte técnico");
        System.out.println("2 - Financeiro");
        System.out.println("3 - Comercial");
        System.out.println("4 - Recursos Humanos");
        System.out.println("5 - Sair");

        System.out.println("");

        System.out.println("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você será direcionado para o Suporte Técnico.");
                break;

            case 2:
                System.out.println("Você será direcionado para o Financeiro.");
                break;

            case 3:
                System.out.println("Você será direcionado para o Comercial.");
                break;

            case 4:
                System.out.println("Você será direcionado para Recursos Humanos.");
                break;

            case 5:
                System.out.println("Encerrando o atendimento...");
                break;

            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
