package fundamentos.dia033;

public class Main {
    static void main(String[] args) {

        System.out.println("==== SOMA DOS PARES ====");

        System.out.println("");

        int i = 1;
        int soma = 0;

        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i);
                soma += i;
            }

            i++;
        }

        System.out.println("Soma dos pares: " + soma);

        System.out.println("");

        System.out.println("==========================");
    }
}
