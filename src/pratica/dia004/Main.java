package pratica.dia004;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas notas serão registradas?");
        int quantidadeNotas = scanner.nextInt();


        int nota = 0;
        double soma = 0;
        double media = 0;
        int aprovadas = 0;
        int reprovadas = 0;
        double maiorNota = 0;
        double menorNota = 10;


        for (int i = 1; i <= quantidadeNotas; i++) {
            nota = scanner.nextInt();
            soma += nota;

            if (nota >= 6) {
                aprovadas++;
            } else {
                reprovadas++;
            }

            if (maiorNota < nota) {
                maiorNota = nota;
            }

            if (menorNota > nota) {
                menorNota = nota;
            }
        }

        media = soma / quantidadeNotas;


        System.out.println("=== RESULTADO ===");
        System.out.println("Quantidade: " + quantidadeNotas);
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Aprovadas: " + aprovadas);
        System.out.println("Reprovadas: " + reprovadas);
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);
    }
}
