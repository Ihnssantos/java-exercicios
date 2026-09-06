package poo.dia062;

public class Main {
    static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Igor";
        pessoa1.idade = 25;
        pessoa1.altura = 1.78;

        System.out.println("Nome: " + pessoa1.nome);
        System.out.println("Idade: " + pessoa1.idade);
        System.out.println("Altura: " + pessoa1.altura);
    }
}
