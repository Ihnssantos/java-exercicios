package fundamentos.dia022;

public class Main {
    static void main(String[] args) {

        int soma = 0;

        System.out.println("==== SOMA DOS PARES ====");

        System.out.println("");

        System.out.println("Números pares:");

        for (int n = 1; n <= 20; n++) {
            if (n % 2 == 0) {
                System.out.println(n);
                soma += n;
            }
        }

        System.out.println("");

        System.out.println("Soma dos pares: " + soma);

        System.out.println("");

        System.out.println("=========================");

    }
}
