package fundamentos.dia061;

import java.util.Scanner;

public class main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionario: ");
        String nome = scanner.next();

        System.out.println("Digite a idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite o salário atual: ");
        double salario = scanner.nextDouble();

        System.out.println("Funcionario está ativo? ");
        boolean status = scanner.nextBoolean();

        System.out.println("");

        System.out.println("=== FUNCIONARIO ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Status: " + status);

        scanner.close();
    }
}
