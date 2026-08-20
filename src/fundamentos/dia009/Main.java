package fundamentos.dia009;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do cliente: ");
        String nome = scanner.next();

        System.out.println("Digite o valor da compra: ");
        double valor = scanner.nextDouble();

        System.out.println("É cliente VIP? ");
        boolean clienteVip = scanner.nextBoolean();

        String validaVip;

        if (valor >= 500.0 || clienteVip) {
            validaVip = "Desconto especial liberado!";
        } else {
            validaVip = "Desconto especial não liberado.";
        }

        System.out.println("==== ANÁLISE DE DESCONTO ====");

        System.out.println("");

        System.out.println("Cliente: " + nome);
        System.out.println("Valor da compra: " + valor);
        System.out.println("VIP: " + clienteVip);

        System.out.println("");

        System.out.println(validaVip);

        System.out.println("");

        System.out.println("===========================");
    }
}
