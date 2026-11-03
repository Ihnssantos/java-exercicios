package fundamentos.dia086;

import java.util.HashSet;
import java.util.Set;

public class Main {
    static void main(String[] args) {

        Set<String> linguagens = new HashSet<>();

        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("Docker");
        linguagens.add("Java");

        System.out.println("Quantidade inicial: " + linguagens.size());
        System.out.println("Contém Docker? " + linguagens.contains("Docker"));
        linguagens.remove("Python");
        System.out.println("Quantidade final: " + linguagens.size());

        System.out.println("");

        System.out.println("Tecnologias cadastradas:");
        for (String linguagem : linguagens) {
            System.out.println(linguagem);
        }
    }
}
