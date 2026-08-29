package fundamentos.dia043;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        int soma = 0;
        int pares = 0;

        System.out.println("Digite os 5 números: ");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();

            soma += numeros[i];

            if (numeros[i] % 2 == 0) {
                pares++;

            }
        }

        System.out.println("==== ANÁLISE DO ARRAY ====");
        System.out.println("");
        System.out.println("Números digitados:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("Soma: " + soma);
        System.out.println("Quantidade de pares: " + pares);

        System.out.println("");

        System.out.println("=======================");
    }
}
