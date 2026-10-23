package fundamentos.dia068;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int segundoNumero = sc.nextInt();

        System.out.println("");

        System.out.println("=== RESULTADO ===");
        System.out.println("Soma: " + somar(primeiroNumero, segundoNumero));
        System.out.println("Multiplicação: " + multiplicar(primeiroNumero, segundoNumero));
    }

    static int somar(int a, int b) {
        return a + b;
    }

    static int multiplicar(int a, int b) {
        return a * b;
    }
}
