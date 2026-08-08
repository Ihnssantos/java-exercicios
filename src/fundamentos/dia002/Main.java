package fundamentos.dia002;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite a cidade que você mora: ");
        String cidade = scanner.nextLine();

        System.out.println("Digite sua profissão: ");
        String profissao = scanner.nextLine();

        System.out.println("Digite uma frase que represente seu objetivo profissional: ");
        String objetivo = scanner.nextLine();

        System.out.println("");

        System.out.println("==== APRESENTAÇÃO ====");

        System.out.println("");

        System.out.println("Nome completo: " + nome + " " + sobrenome);
        System.out.println("Cidade: " + cidade);
        System.out.println("Profissão: " + profissao);
        System.out.println("Objetivo: " + objetivo);

        System.out.println("");

        System.out.println("==========================");

    }
}
