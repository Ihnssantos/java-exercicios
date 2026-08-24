package fundamentos.dia020;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        int resultado;

        System.out.println("==== TABUADA ====");

        System.out.println("");

        for (int n = 1; n <= 10; n++) {
            resultado = numero * n;
            System.out.println(numero + " x " + n + " = " + resultado);
        }

        System.out.println("");

        System.out.println("================");
    }
}
