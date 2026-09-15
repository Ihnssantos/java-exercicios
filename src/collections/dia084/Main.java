package collections.dia084;

import java.util.Set;
import java.util.HashSet;

public class Main {
    static void main(String[] args) {

        Set<String> nomes = new HashSet<>();

        nomes.add("Igor");
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Igor");
        nomes.add("João");

        System.out.println(nomes);
        System.out.println(nomes.size());

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
