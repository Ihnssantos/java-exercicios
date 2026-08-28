package fundamentos.dia041;

public class Main {
    static void main(String[] args) {

        int[] numeros = {10, 20, 30, 40, 50};

        System.out.println("==== ALTERANDO ARRAY ====");

        System.out.println("");

        System.out.println("Array original:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("");

        numeros[1] = 99;

        System.out.println("Array alterado:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("");

        System.out.println("=======================");
    }
}
