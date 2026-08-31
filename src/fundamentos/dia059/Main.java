package fundamentos.dia059;

public class Main {
    static void main(String[] args) {

        int resultado1 = somar(10, 20);
        int resultado2 = somar(10, 20, 30);

        System.out.println("Primeiro resultado: " + resultado1);
        System.out.println("Segundo resultado: " + resultado2);
    }

    static int somar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    static int somar(int numero1, int numero2, int numero3) {
        return numero1 + numero2 + numero3;
    }
}
