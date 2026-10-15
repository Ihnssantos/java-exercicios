package collections.dia083;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {

        List<String> tecnologias = new ArrayList<>();

        tecnologias.add("Java");
        tecnologias.add("Spring Boot");
        tecnologias.add("SQL");
        tecnologias.add("Docker");

        for (String tecnologia : tecnologias) {
            System.out.println(tecnologia);
        }

        System.out.println(tecnologias.size());

    }
}
