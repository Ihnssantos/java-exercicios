package collections.dia078;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {

        ArrayList<String> frutas = new ArrayList<>();

        frutas.add("Uva");
        frutas.add("Banana");
        frutas.add("Morango");

        System.out.println(frutas);
        System.out.println(frutas.get(0));//Uva
        System.out.println(frutas.get(2));//Morango
        System.out.println(frutas.size());
    }
}
