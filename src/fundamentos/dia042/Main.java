package fundamentos.dia042;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("==== PREENCHENDO ARRAY ====");

        System.out.println("");

        System.out.println("Digite um número: ");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("");

        System.out.println("Números digitados:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("");

        System.out.println("=============================");
    }
}
