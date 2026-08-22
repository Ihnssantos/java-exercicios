package fundamentos.dia013;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int segundoNumero = scanner.nextInt();


        if (primeiroNumero > segundoNumero) {
            System.out.println("==== COMPARAÇÃO ====");

            System.out.println("");

            System.out.println("Primeiro número: " + primeiroNumero);
            System.out.println("Segundo número: " + segundoNumero);

            System.out.println("");

            System.out.println("Maior número: " + primeiroNumero);

            System.out.println("");

            System.out.println("====================================");

        } else if (primeiroNumero == segundoNumero) {
            System.out.println("==== COMPARAÇÃO ====");

            System.out.println("");

            System.out.println("Primeiro número: " + primeiroNumero);
            System.out.println("Segundo número: " + segundoNumero);

            System.out.println("");

            System.out.println("Os números são iguais!");

            System.out.println("");

            System.out.println("====================================");

        } else {
            System.out.println("==== COMPARAÇÃO ====");

            System.out.println("");

            System.out.println("Primeiro número: " + primeiroNumero);
            System.out.println("Segundo número: " + segundoNumero);

            System.out.println("");

            System.out.println("Maior número: " + segundoNumero);

            System.out.println("");

            System.out.println("====================================");
        }
    }
}


