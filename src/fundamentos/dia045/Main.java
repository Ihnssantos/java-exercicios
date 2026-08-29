package fundamentos.dia045;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("Digite os números:");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }


        System.out.println("Qual número deseja buscar?");
        int buscarNumero = scanner.nextInt();

        boolean resultado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (buscarNumero == numeros[i]) {
                resultado = true;
            }
        }

        if (resultado) {
            System.out.println("Número encontrado!");
        } else {
            System.out.println("Número não encontrado!");
        }

    }
}
