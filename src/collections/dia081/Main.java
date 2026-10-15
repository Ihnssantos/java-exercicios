package collections.dia081;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("Igor", 25);
        Pessoa pessoa2 = new Pessoa("João", 30);
        Pessoa pessoa3 = new Pessoa("Maria", 22);

        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);

        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome() + " | Idade: " + pessoa.getIdade());
        }

    }
}
