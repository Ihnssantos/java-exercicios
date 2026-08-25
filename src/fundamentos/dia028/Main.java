package fundamentos.dia028;

public class Main {
    static void main(String[] args) {

        int quantidadePares = 0;
        int quantidadeImpares = 0;
        int somaPares = 0;
        int somaImpares = 0;
        int maior = 0;
        int menor = 10;


        System.out.println("==== ÁNALISE DOS NUMEROS ====");

        System.out.println("");

        //PARES
        System.out.println("Pares:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);

                quantidadePares++;
                somaPares += i;
            }
        }


        System.out.println("");


        //IMPARES
        System.out.println("ímpares:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 1) {
                System.out.println(i);

                quantidadeImpares++;
                somaImpares += i;
            }
        }


        //MAIOR E MENOR
        for (int i = 1; i <= 20; i++) {
            if (i > maior) {
                maior = i;
            }

            if (i < menor) {
                menor = i;
            }
        }

        System.out.println("");

        System.out.println("Quantidade de pares: " + quantidadePares);
        System.out.println("Quantidade de ímpares: " + quantidadeImpares);

        System.out.println("");

        System.out.println("Soma dos pares: " + somaPares);
        System.out.println("Soma dos ímpares: " + somaImpares);

        System.out.println("");

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

        System.out.println("");

        System.out.println("===================================");

    }
}