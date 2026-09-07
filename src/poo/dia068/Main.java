package poo.dia068;

public class Main {
    static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Igor", 25);

        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());

        pessoa1.setNome("João");
        pessoa1.setIdade(30);

        System.out.println("");

        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
    }
}
