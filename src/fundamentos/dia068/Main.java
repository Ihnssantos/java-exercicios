package fundamentos.dia068;

import java.util.Scanner;

//EXERCICIOS DE UM CURSO
public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //exercicio 01
        System.out.println("Hello, World!");

        //exercicio 02
        final String nome = "Igor";
        int idade = 25;
        double altura = 1.78;
        char letra = 'a';

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(altura);
        System.out.println(letra);


        //exercicio03
        String name = scanner.next();
        System.out.println("Olá, " + name);


        //exercicio 04
        int n1 = 5;
        int n2 = 3;

        System.out.println(n1 + n2);
        System.out.println(n1 - n2);
        System.out.println(n1 * n2);
        System.out.println(n1 / n2);


        //exercicio 05
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }


        //exercicio 06
        int numero = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            numero = numero * i;
            System.out.println(numero);
        }
    }
}
