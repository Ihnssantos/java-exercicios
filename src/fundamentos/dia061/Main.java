package fundamentos.dia061;

import java.util.Scanner;

public class Main {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Dados do aluno ====");
        System.out.println("");

        System.out.println("Digite o nome: ");
        String nome = scanner.next();

        System.out.println("");

        System.out.println("Digite a idade: ");
        int idade = scanner.nextInt();

        System.out.println("");

        System.out.println("Digite a nota: ");
        int[] notas = new int[5];

        for (int i = 0; i < notas.length; i++) {
            notas[i] = scanner.nextInt();
        }


        System.out.println("");


        System.out.println("==== Informações básicas ====");

        System.out.println(analiseBasica(nome, idade));


        System.out.println("");


        System.out.println("==== Análise das Notas ====");

        System.out.println("Soma das notas: " + somarNota(notas));
        System.out.println("Média das notas: " + calcularMedia(notas));
        System.out.println("Maior nota: " + encontraMaior(notas));
        System.out.println("Menor nota: " + encontrarMenor(notas));
        System.out.println("Quantidade de notas pares: " + quantidadePares(notas));


        System.out.println("");


        System.out.println("==== Situação do aluno ====");

        double media = calcularMedia(notas);

        if (media >= 7) {
            System.out.println("Aprovado!");
        } else if (media >= 5) {
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }
    }


    static int somarNota(int[] notas) {
        int soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        return soma;
    }


    static double calcularMedia(int[] notas) {
        int somaNota = 0;
        int quantidade = 0;

        for (int i = 0; i < notas.length; i++) {
            somaNota += notas[i];
            quantidade++;
        }

        return (double) somaNota / quantidade;
    }


    static int encontraMaior(int[] notas) {
        int maiorNota = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
            }
        }

        return maiorNota;
    }


    static int encontrarMenor(int[] notas) {
        int menorNota = notas[0];

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < menorNota) {
                menorNota = notas[i];
            }
        }

        return menorNota;
    }


    static int quantidadePares(int[] notas) {
        int pares = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] % 2 == 0) {
                pares++;
            }
        }

        return pares;
    }


    static String analiseBasica(String nome, int idade) {

        String analise =
                "Nome: " + nome + "\n" +
                        "Idade: " + idade + "\n" +
                        "Maiúsculo: " + nome.toUpperCase() + "\n" +
                        "Minúsculo: " + nome.toLowerCase() + "\n" +
                        "Quantidade de Caracteres: " + nome.length() + "\n" +
                        "Primeiro caractere: " + nome.charAt(0);

        return analise;
    }
}
