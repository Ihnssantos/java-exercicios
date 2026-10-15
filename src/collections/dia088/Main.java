package collections.dia088;

import java.util.*;

public class Main {
    static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa(1, "Igor", 25);
        Pessoa pessoa2 = new Pessoa(2, "João", 17);
        Pessoa pessoa3 = new Pessoa(3, "Maria", 30);
        Pessoa pessoa4 = new Pessoa(4, "Ana", 22);

        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        pessoas.add(pessoa4);

        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdade() >= 18) {
                System.out.println(pessoa.getNome());
            }
        }


        //------------------------------------------------------------
        Set<String> linguagens = new HashSet<>();

        linguagens.add("Java");
        linguagens.add("Spring");
        linguagens.add("Java");
        linguagens.add("Spring");

        System.out.println(linguagens);
        System.out.println(linguagens.size());


        //-------------------------------------------------------------
        Map<Integer, Pessoa> pessoa = new HashMap<>();

        pessoa.put(1, pessoa1);
        pessoa.put(2, pessoa2);
        pessoa.put(3, pessoa3);

        for (Map.Entry<Integer, Pessoa> entry : pessoa.entrySet()) {
            System.out.println("ID: " + entry.getKey()
                    + " - Nome: " + entry.getValue().getNome());
        }
    }
}
