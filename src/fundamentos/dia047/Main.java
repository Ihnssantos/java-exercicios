package fundamentos.dia047;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        int soma = 0;
        int pares = 0;
        int somaPares = 0;
        int maior = 0;
        int menor = 10;

        System.out.println("==== ANÁLISE DO ARRAY ====");

        System.out.println("");

        //recebendo os numeros
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        //exibindo numeros digitados e pegando a soma deles
        System.out.println("Números digitados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
            soma += numeros[i];
        }

        //pegando numeros pares
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            }
        }

        //somando numeros pares
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                somaPares += numeros[i];
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("");

        System.out.println("Soma: " + soma);
        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Soma dos pares " + somaPares);
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

        System.out.println("");

        System.out.println("======================");

    }
}
