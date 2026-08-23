package fundamentos.dia015;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int segundoNumero = scanner.nextInt();

        System.out.println("Digite o terceiro número:");
        int terceiroNumero = scanner.nextInt();

        int maior;

        if (primeiroNumero >= segundoNumero && primeiroNumero >= terceiroNumero) {
            maior = primeiroNumero;
        } else if (segundoNumero >= primeiroNumero && segundoNumero >= terceiroNumero) {
            maior = segundoNumero;
        } else {
            maior = terceiroNumero;
        }

        System.out.println("==== COMPARAÇÃO ====");
        System.out.println();

        System.out.println("Primeiro número: " + primeiroNumero);
        System.out.println("Segundo número: " + segundoNumero);
        System.out.println("Terceiro número: " + terceiroNumero);

        System.out.println();

        if (primeiroNumero == segundoNumero && primeiroNumero == terceiroNumero) {
            System.out.println("Todos os números são iguais.");
        } else if (primeiroNumero == segundoNumero && primeiroNumero > terceiroNumero) {
            System.out.println("Os maiores números são iguais: " + primeiroNumero);
        } else if (primeiroNumero == terceiroNumero && primeiroNumero > segundoNumero) {
            System.out.println("Os maiores números são iguais: " + primeiroNumero);
        } else if (segundoNumero == terceiroNumero && segundoNumero > primeiroNumero) {
            System.out.println("Os maiores números são iguais: " + segundoNumero);
        } else {
            System.out.println("Maior número: " + maior);
        }

        System.out.println();
        System.out.println("========================");

        scanner.close();
    }
}