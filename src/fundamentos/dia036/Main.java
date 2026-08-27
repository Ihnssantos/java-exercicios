package fundamentos.dia036;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==== ANÁLISE DOS NÚMEROS ====");

        System.out.println("");

        int contador = 0;
        int soma = 0;
        int pares = 0;
        int maior = 0;
        int menor = 10;

        while (contador < 5) {
            System.out.println("Digite um número: ");
            int numero = scanner.nextInt();

            System.out.println(numero);

            if (numero % 2 == 0) {
                pares++;
            }

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }

            contador++;
            soma += numero;
        }

        System.out.println("");

        System.out.println("Soma: " + soma);
        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

        System.out.println("");

        System.out.println("=========================");

    }
}
