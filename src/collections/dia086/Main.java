package collections.dia086;

import java.util.Map;
import java.util.HashMap;

public class Main {
    static void main(String[] args) {

        Map<Integer, String> pessoas = new HashMap<>();

        pessoas.put(1, "Igor");
        pessoas.put(2, "João");
        pessoas.put(3, "Maria");

        for (Map.Entry<Integer, String> pessoa : pessoas.entrySet()) {
            System.out.println(
                    "ID: " + pessoa.getKey() +
                            " | Nome: " + pessoa.getValue()
            );
        }
    }
}
