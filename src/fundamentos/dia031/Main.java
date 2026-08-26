package fundamentos.dia031;

public class Main {
    static void main(String[] args) {

        System.out.println("==== SOMA DOS NÚMEROS ====");

        System.out.println("");

        int i = 1;
        int soma = 0;

        while (i <= 10) {
            System.out.println(i);
            soma += i;
            i++;
        }

        System.out.println("");

        System.out.println("Soma dos núemros: " + soma);

        System.out.println("");

        System.out.println("==========================");
    }
}
