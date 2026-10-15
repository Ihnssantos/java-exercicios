package collections.dia079;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {

        ArrayList<String> linguagens = new ArrayList<>();

        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("JavaScript");
        linguagens.add("C#");

        System.out.println(linguagens);
        linguagens.set(1, "TypeScript");//altera
        linguagens.remove(3);//remove
        System.out.println(linguagens.contains("Java"));//verifica se existe
        System.out.println(linguagens.size());//tamanho
        System.out.println(linguagens);
    }
}
