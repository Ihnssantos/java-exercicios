package pratica.dia002;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        String nome = scanner.next();

        System.out.println("Digite o salário atual: ");
        double salario = scanner.nextDouble();

        System.out.println("Digite os anos de empresa: ");
        int anosEmpresa = scanner.nextInt();


        int percentual;

        if (anosEmpresa < 2) {
            percentual = 5;
        } else if (anosEmpresa >= 2 && anosEmpresa <= 5) {
            percentual = 10;
        } else {
            percentual = 15;
        }

        double valorAumento = salario * percentual / 100;
        double novoSalario = salario + valorAumento;

        System.out.println("Nome: " + nome);
        System.out.println("Salário atual: " + salario);
        System.out.println("Anos de empresa: " + anosEmpresa);

        System.out.println("");

        System.out.println("Aumento: " + percentual + "%");
        System.out.println("Valor do aumento: " + valorAumento);
        System.out.println("Novo salário: " + novoSalario);
    }
}
