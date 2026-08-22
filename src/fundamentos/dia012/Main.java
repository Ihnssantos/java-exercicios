package fundamentos.dia012;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int segundoNumero = scanner.nextInt();

        int soma = primeiroNumero + segundoNumero;
        int subtracao = primeiroNumero - segundoNumero;
        int multiplicacao = primeiroNumero * segundoNumero;
        double divisao = (double) primeiroNumero / segundoNumero;

        System.out.println("==== CALCULADORA ====");

        System.out.println("");

        System.out.println("Usuário: " + nome);
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);

        System.out.println("");

        System.out.println("========================");
    }
}
