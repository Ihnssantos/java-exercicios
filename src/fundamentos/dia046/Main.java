package fundamentos.dia046;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        int pares = 0;
        int somaPares = 0;

        System.out.println("==== SOMA DOS PARES ====");

        System.out.println("");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Números digitados:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares = numeros[i];
                somaPares += pares;
            }
        }

        System.out.println("");

        System.out.println("Soma dos pares: " + somaPares);

        System.out.println("");

        System.out.println("=====================");
    }
}
