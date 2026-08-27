package fundamentos.dia038;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("==== MENU ====");

            System.out.println("");

            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Consultar usuário");
            System.out.println("3 - Sair");

            System.out.println("");

            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Usuário cadastrado!");
                    break;
                case 2:
                    System.out.println("Consultando usuário...");
                    break;
                case 3:
                    System.out.println("Encerrando o sistema...");
                    break;
            }
        } while (opcao != 3);

    }
}
