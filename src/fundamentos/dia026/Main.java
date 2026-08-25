package fundamentos.dia026;

public class Main {
    static void main(String[] args) {

        int maior = 0;

        System.out.println("==== MAIOR NÚMERO ====");

        System.out.println("");

        System.out.println("Números:");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

            if (i > maior) {
                maior = i;
            }
        }

        System.out.println("Maior número: " + maior);

        System.out.println("");

        System.out.println("=======================");

    }
}
