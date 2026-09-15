package collections.dia087;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();

        numeros.add(50);
        numeros.add(10);
        numeros.add(40);
        numeros.add(20);
        numeros.add(30);

        System.out.println(numeros);

        Collections.sort(numeros);//ordena

        System.out.println(numeros);

    }
}
