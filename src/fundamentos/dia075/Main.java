package fundamentos.dia075;

public class Main {
    static void main(String[] args) {

        Computador computador1 = new Computador("Dell", "Intel Core i7", 8);
        Computador computador2 = new Computador("Lenovo", "AMD Ryzen 5", 6);

        System.out.println(computador1.apresentarComputador());
        System.out.println(computador2.apresentarComputador());
    }
}
