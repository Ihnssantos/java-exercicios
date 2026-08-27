package fundamentos.dia034;

public class Main {
    static void main(String[] args) {

        System.out.println("==== MAIOR E MENOR ====");

        System.out.println("");

        int i = 1;
        int maior = 0;
        int menor = 10;

        while (i <= 20) {
            System.out.println(i);
            if (i > maior) {
                maior = i;
            }

            if (i < menor) {
                menor = i;
            }

            i++;
        }

        System.out.println("");

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

        System.out.println("");

        System.out.println("============================");
    }
}
