package fundamentos.dia089;

public class Main {
    static void main(String[] args) {

        try {
            System.out.println(dividir(10, 0));
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Operação finalizada!");
        }

        System.out.println("Programa continua!");
    }

    public static int dividir(int numero1, int numero2) {

        if (numero2 == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero!");
        }

        return numero1 / numero2;
    }
}