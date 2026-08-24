package fundamentos.dia023;

public class Main {
    static void main(String[] args) {

        int soma = 0;
        int quantidade = 0;

        System.out.println("==== ANÁLISE DOS PARES ====");

        System.out.println("");

        System.out.println("Números pares:");

        for (int n = 1; n <= 20; n++) {
            if (n % 2 == 0) {
                System.out.println(n);
                soma += n;
                quantidade += 1;
            }
        }

        System.out.println("");

        System.out.println("Quantidade de pares: " + quantidade);
        System.out.println("Soma dos pares: " + soma);

        System.out.println("");

        System.out.println("=============================");
    }
}
