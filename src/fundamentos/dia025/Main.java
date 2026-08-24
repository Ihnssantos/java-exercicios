package fundamentos.dia025;

public class Main {
    static void main(String[] args) {

        int quantidade = 0;

        int soma = 0;

        System.out.println("==== ANALISE DOS ÍMPARES ====");

        System.out.println("");

        System.out.println("Números ímpares:");

        for (int n = 1; n <= 20; n++) {
            if (n % 2 == 1) {
                System.out.println(n);
                quantidade++;
                soma += n;
            }
        }

        System.out.println("");

        System.out.println("Quantidade de ímpares: " + quantidade);
        System.out.println("Soma dos ímpares: " + soma);

        System.out.println("");

        System.out.println("==============================");
    }
}
