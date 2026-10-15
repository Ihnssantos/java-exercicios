package collections.dia080;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Igor");
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Ana");

        System.out.println("=== FOR ===");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        System.out.println("");


        System.out.println("=== FOR-EACH ===");
        for (String nome : nomes) {
            System.out.println(nome);
        }


    }
}
