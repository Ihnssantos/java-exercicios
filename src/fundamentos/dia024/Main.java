package fundamentos.dia024;

public class Main {
    static void main(String[] args) {

        int soma = 0;
        int quantidade = 0;
        double media;

        System.out.println("==== MÉDIA DOS NÚMEROS ====");

        System.out.println("");

        System.out.println("Números: ");

        for (int n = 1; n <= 10; n++) {
            System.out.println(n);
            soma += n;
            quantidade++;
        }

        media = (double) soma / quantidade;

        System.out.println("");

        System.out.println("Soma: " + soma);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Média: " + media);

        System.out.println("");

        System.out.println("=============================");

    }
}
