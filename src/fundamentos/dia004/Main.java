package fundamentos.dia004;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        String nome = scanner.next();

        System.out.println("Digite o cargo: ");
        String cargo = scanner.next();

        System.out.println("Digite o salário: ");
        double salario = scanner.nextDouble();

        System.out.println("Digite os anos de empresa: ");
        int anosEmpresa = scanner.nextInt();

        double novoSalario = salario;

        String mensagem = nome + " trabalha como " + cargo + " e possui " + anosEmpresa + " anos de empresa.";

        System.out.println("==== FUNCIONÁRIO ====");

        System.out.println("");

        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
        System.out.println("Tempo de empresa: " + anosEmpresa + " anos");
        System.out.println(mensagem);

        System.out.println("");

        System.out.println("Novo salário: " + novoSalario);



    }
}
