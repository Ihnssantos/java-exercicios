package fundamentos.dia044;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        int maior = 0;
        int menor = 10;

        System.out.println("Digite os números:");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();

            if (numeros[i] > maior) {
                maior = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("Números digitados:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("");

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }
}
