package fundamentos.dia035;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==== SOMA DOS NÚMEROS ====");

        System.out.println("");

        int contador = 0;
        int soma = 0;

        while (contador < 5) {
            System.out.println("Digite um número:");
            int numero = scanner.nextInt();

            System.out.println(numero);

            soma += numero;

            contador++;
        }

        System.out.println("");

        System.out.println("Soma dos números: " + soma);

        System.out.println("");

        System.out.println("=========================");
    }
}
