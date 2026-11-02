package fundamentos.dia085;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {

        List<String> linguagens = new ArrayList<>();

        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("JavaScript");

        System.out.println("Primeira linguagem: " + linguagens.get(0));
        System.out.println("Quantidade inicial: " + linguagens.size());
        linguagens.set(1, "C#");
        linguagens.remove(2);
        System.out.println("Contém Java? " + linguagens.contains("Java"));

        System.out.println("");

        System.out.println("Linguagens cadastradas:");
        for (int i = 0; i < linguagens.size(); i++) {
            System.out.println(linguagens.get(i));
        }
    }
}
