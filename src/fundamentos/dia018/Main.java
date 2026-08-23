package fundamentos.dia018;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int segundoNumero = scanner.nextInt();

        System.out.println("Escolha a operação: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int opcao = scanner.nextInt();

        int resultado;

        switch (opcao) {
            case 1:
                resultado = primeiroNumero + segundoNumero;
                System.out.println("Primeiro número: " + primeiroNumero);
                System.out.println("Segundo número: " + segundoNumero);
                System.out.println("Opção: " + opcao);

                System.out.println("");

                System.out.println("Resultado: " + resultado);
                break;

            case 2:
                resultado = primeiroNumero - segundoNumero;
                System.out.println("Primeiro número: " + primeiroNumero);
                System.out.println("Segundo número: " + segundoNumero);
                System.out.println("Opção: " + opcao);

                System.out.println("");

                System.out.println("Resultado: " + resultado);
                break;

            case 3:
                resultado = primeiroNumero * segundoNumero;
                System.out.println("Primeiro número: " + primeiroNumero);
                System.out.println("Segundo número: " + segundoNumero);
                System.out.println("Opção: " + opcao);

                System.out.println("");

                System.out.println("Resultado: " + resultado);
                break;

            case 4:
                if (segundoNumero == 0) {
                    System.out.println("Primeiro número: " + primeiroNumero);
                    System.out.println("Segundo número: " + segundoNumero);
                    System.out.println("Opção: " + opcao);

                    System.out.println("");

                    System.out.println("Não é possivel dividir por zero!");
                } else {
                    double resultadoDivisao = (double) primeiroNumero / segundoNumero;
                    System.out.println("Primeiro número: " + primeiroNumero);
                    System.out.println("Segundo número: " + segundoNumero);
                    System.out.println("Opção: " + opcao);

                    System.out.println("");

                    System.out.println("Resultado: " + resultadoDivisao);
                    break;
                }

            default:
                System.out.println("Opção inválida!");
        }
    }
}
