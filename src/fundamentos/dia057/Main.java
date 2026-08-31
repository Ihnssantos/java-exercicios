package fundamentos.dia057;

public class Main {
    static void main(String[] args) {
        int resultado = somar(10, 20);

        System.out.println("==== SOMA ====");

        System.out.println("");

        System.out.println("Resultado: " + resultado);

        System.out.println("");

        System.out.println("=============");
    }

    static int somar(int numero1, int numero2) {
        return numero1 + numero2;
    }
}
