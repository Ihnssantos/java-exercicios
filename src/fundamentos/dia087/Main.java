package fundamentos.dia087;

import java.util.Map;
import java.util.HashMap;

public class Main {
    static void main(String[] args) {

        Map<Integer, String> produtos = new HashMap<>();

        produtos.put(1, "Notebook");
        produtos.put(2, "Mouse");
        produtos.put(3, "Teclados");

        System.out.println("Produto código 2: " + produtos.get(2));
        System.out.println("Quantidade inicial: " + produtos.size());
        produtos.put(3, "Monitor");
        System.out.println("Existe código 1? " + produtos.containsKey(1));
        produtos.remove(2);

        System.out.println("");

        System.out.println("Produtos cadastrados: ");
        for (Integer id : produtos.keySet()) {
            System.out.println(id + " - " + produtos.get(id));
        }

    }
}
