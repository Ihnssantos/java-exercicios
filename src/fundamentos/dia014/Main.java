package fundamentos.dia014;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        int resto = numero % 2;
        String resultado;

        if (resto == 0) {
            resultado = "Par";
        } else {
            resultado = "Ímpar";
        }

        System.out.println("==== Análise ====");

        System.out.println("");

        System.out.println("Número: " + numero);
        System.out.println("Resultado: " + resultado);

        System.out.println("");

        System.out.println("=======================");
    }
}
