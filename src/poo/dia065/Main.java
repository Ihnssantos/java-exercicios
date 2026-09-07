package poo.dia065;

public class Main {
    static void main(String[] args) {

        Carro carro1 = new Carro("Ford", "Focus", 2009);
        Carro carro2 = new Carro("Toyota", "Corolla", 2025);

        System.out.println("Marca: " + carro1.marca);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Ano: " + carro1.ano);

        System.out.println("");

        System.out.println("Marca: " + carro2.marca);
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Ano: " + carro2.ano);
    }
}
