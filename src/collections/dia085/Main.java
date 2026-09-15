package collections.dia085;

import java.util.Map;
import java.util.HashMap;

public class Main {
    static void main(String[] args) {

        Map<Integer, String> pessoas = new HashMap<>();

        pessoas.put(1, "Igor");
        pessoas.put(2, "João");
        pessoas.put(3, "Maria");

        System.out.println(pessoas);
        System.out.println(pessoas.get(2));
        System.out.println(pessoas.containsKey(3));
        System.out.println(pessoas.size());

        pessoas.put(2, "Carlos");

        System.out.println(pessoas);

    }
}
