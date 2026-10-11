package fundamentos.dia065;

import java.util.Scanner;

public class main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        int soma = 0;
        double media = 0;
        int pares = 0;
        int impares = 0;
        int maior = 0;
        int menor = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o um número: ");
            numeros[i] = scanner.nextInt();

            //SOMA
            soma += numeros[i];

            //PAR E IMPAR
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            //MAIOR E MENOR
            if (i == 0) {
                maior = numeros[i];
                menor = numeros[i];
            }

            if (numeros[i] > maior) {
                maior = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        //MEDIA
        media = (double) soma / numeros.length;

        System.out.println("=== ANÁLISE DOS NÚMEROS ===");
        System.out.println(numeros[0] + ", " + numeros[1] + ", " + numeros[2] + ", " + numeros[3] + ", " + numeros[4]);
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }
}
