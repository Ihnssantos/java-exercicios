package fundamentos.dia060;

public class Main {
    static void main(String[] args) {

        int numero1 = 10;
        int numero2 = 5;

        System.out.println("==== ANÁLISE COM METODOS ====");

        System.out.println("");

        System.out.println("Soma: " + somar(numero1, numero2));
        System.out.println("Subtração: " + subtrair(numero1, numero2));
        System.out.println("São iguais? " + saoIguais(numero1, numero2));

        System.out.println("");

        System.out.println("============================");

    }

    static int somar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    static int subtrair(int numero1, int numero2) {
        return numero1 - numero2;
    }

    static boolean saoIguais(int numero1, int numero2) {
        return numero1 == numero2;
    }


}
