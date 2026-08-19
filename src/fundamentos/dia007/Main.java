package fundamentos.dia007;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.next();

        System.out.println("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        String avaliacaoNota;

        if (nota >= 9.0) {
            avaliacaoNota = "Excelente";
        } else if (nota >= 7.0) {
            avaliacaoNota = "Bom";
        } else if (nota >= 5.0) {
            avaliacaoNota = "Regular";
        } else {
            avaliacaoNota = "Ruim";
        }

        String situacao;

        if (avaliacaoNota.equals("Excelente") || avaliacaoNota.equals("Bom")) {
            situacao = "Aprovado";
        } else if (avaliacaoNota.equals("Regular")) {
            situacao = "Recuperação";
        } else {
            situacao = "Reprovado";
        }

        System.out.println("==== RESULTADO ====");

        System.out.println("");

        System.out.println("Aluno: " + nome);
        System.out.println("Nota: " + nota);
        System.out.println("Classificação: " + avaliacaoNota);
        System.out.println("Situação: " + situacao);

        System.out.println("");

        System.out.println("=========================");
    }
}
