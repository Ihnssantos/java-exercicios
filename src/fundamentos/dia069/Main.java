package fundamentos.dia069;

import java.util.Scanner;

//EXERCICIOS DE UM CURSO
public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = scanner.nextInt();

        //Exercicio 01
        if (numero <= 0) {
            System.out.println("Número negativo");
        } else {
            System.out.println("Número positivo");
        }


        //Exercicio 02
        if (numero % 2 == 0) {
            System.out.println("Número par");
        } else {
            System.out.println("Número impar");
        }


        //Exercicio 03
        System.out.println("Digite dois numeros diferentes: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        if (n1 > n2) {
            System.out.println("O primeiro numero é maior");
        } else {
            System.out.println("O segundo numero é menor");
        }


        //Exercicio 04
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 16) {
            System.out.println("Autorizado a votar");
        } else {
            System.out.println("Não autorizado a votar");
        }


        //Exercicio 05
        System.out.println("Digite a nota de 0 a 10: ");
        int nota = scanner.nextInt();

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
