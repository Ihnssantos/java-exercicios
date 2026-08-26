package fundamentos.dia032;

public class Main {
    static void main(String[] args) {

        System.out.println("==== NÚMEROS PARES ====");

        System.out.println("");

        int i = 1;
        int quantidade = 0;

        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i);
                quantidade++;
            }

            i++;
        }

        System.out.println("");

        System.out.println("Quantidade de pares: " + quantidade);

        System.out.println("");

        System.out.println("=========================");
    }
}
