package poo.dia063;

public class Main {
    static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Igor";
        pessoa1.idade = 25;

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Erica";
        pessoa2.idade = 23;

        pessoa1.apresentar();
        pessoa2.apresentar();
    }
}
