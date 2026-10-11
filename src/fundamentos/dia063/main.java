package fundamentos.dia063;

import java.util.Scanner;

public class main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //ENTRADA DOS DADOS
        System.out.println("Nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.println("Salário: ");
        double salario = scanner.nextDouble();

        System.out.println("Tempo de empresa: ");
        int tempoEmpresa = scanner.nextInt();

        System.out.println("Código do departamento: ");
        int codigo = scanner.nextInt();


        //PERCENTUAL
        int percentual;

        if (tempoEmpresa < 2) {
            percentual = 5;
        } else if (tempoEmpresa <= 5) {
            percentual = 10;
        } else {
            percentual = 15;
        }


        //VALOR DO AUMENTO E DO NOVO SALARIO
        double valorAumento = salario * percentual / 100;
        double novoSalario = salario + valorAumento;


        //DEPARTAMENTO
        String departamento;

        switch (codigo) {
            case 1:
                departamento = "Tecnologia";
                break;

            case 2:
                departamento = "Financeiro";
                break;

            case 3:
                departamento = "Recursos Humanos";
                break;

            default:
                departamento = "Departamento inválido";
                break;
        }

        System.out.println("");


        //RESULTADO
        System.out.println("=== ANÁLISE DO FUNCIONÁRIO ===");
        System.out.println("Nome: " + nome);
        System.out.println("Departamento: " + departamento);
        System.out.println("Tempo de empresa: " + tempoEmpresa + " anos");
        System.out.println("Salário anterior: " + salario);
        System.out.println("Percentual de aumento: " + percentual + "%");
        System.out.println("Valor do aumento: " + valorAumento);
        System.out.println("Novo salário: " + novoSalario);
    }
}
