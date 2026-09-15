package collections.dia082;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("Igor", 25);
        Pessoa pessoa2 = new Pessoa("João", 17);
        Pessoa pessoa3 = new Pessoa("Maria", 30);
        Pessoa pessoa4 = new Pessoa("Ana", 15);

        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        pessoas.add(pessoa4);

        System.out.println("=== MAIORES DE IDADE ===");
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdade() >= 18) {
                System.out.println(pessoa.getNome() + " - " + pessoa.getIdade());
            }
        }
    }
}
