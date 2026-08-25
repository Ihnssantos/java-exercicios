package fundamentos.dia027;

public class Main {
    static void main(String[] args) {

        int menor = 10;

        System.out.println("==== MENOR NÚMERO ====");

        System.out.println("");

        System.out.println("Números:");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

            if (i < menor) {
                menor = i;
            }
        }

        System.out.println("Menor número: " + menor);

        System.out.println("");

        System.out.println("=======================");

    }
}
