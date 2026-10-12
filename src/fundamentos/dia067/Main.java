package fundamentos.dia067;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //VARIAVEL, ENTRADA e SAÍDA DE DADOS

        String palavra = scanner.next();//Entrada
        System.out.println(palavra);//Saída
        //------------------------------------------------------


        //TIPOS DE DADOS PRIMITIVOS

        int idade = 25;//Variavel
        double altura = 1.78;//Variavel
        final String nome = "Igor";//CONSTANTE
        boolean programador = true;//Variavel
        //-------------------------------------------------------


        //OPERADORES

        int n1 = 20;
        int n2 = 40;
        int n3 = 60;

        //Atribuição
        System.out.println(n1 = n2);//Atribui
        System.out.println(n2 += n1);//Soma e atribui
        System.out.println(n2 -= n1);//Subtrai e atribui
        System.out.println(n2 *= n1);//Multiplica e atribui
        System.out.println(n2 /= n1);//Divie e atribui

        //Aritimeticos
        System.out.println(n1 + n2);//Soma
        System.out.println(n2 - n1);//Subtração
        System.out.println(n2 * n1);//Multiplicação
        System.out.println(n2 / n1);//Divisão
        System.out.println(n2 % n1);//Resto da divisão

        //Relacionais
        System.out.println(n1 == n2);//Igual
        System.out.println(n1 != n2);//Diferente
        System.out.println(n1 > n2);//Maior
        System.out.println(n1 >= n2);//Maior ou igual
        System.out.println(n1 < n2);//Menor
        System.out.println(n1 <= n2);//Menor ou igual

        //Lógicos -> ||(OU) &&(E)
        System.out.println(n1 < n2 || n3 > n2);//true
        System.out.println(n2 > n1 && n2 > n3);//false

        //Ternário ->             condição           se              se não
        String verificaIdade = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        //------------------------------------------------------


        //ESTRUTURA CONDICIONAL

        //If e else
        if (idade >= 60) {
            System.out.println("Idoso");
        } else if (idade >= 18) {
            System.out.println("Adulto");
        } else if (idade >= 12) {
            System.out.println("Adolescente");
        } else {
            System.out.println("Criança");
        }

        //Switch
        String cor = "Amarelo";

        switch (cor) {
            case "Verde":
                System.out.println("A cor é verde");
                break;

            case "Amarelo":
                System.out.println("A cor é Amarelo");
                break;
        }
        //-------------------------------------------------


        //ESTRUTURA CONDICIONAL

        //For -> inicialização; condição; incremento
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        //While
        int contador = 1;

        while (contador < 10) {
            System.out.println(contador);
            contador++;
        }

        //do while
        do {
            System.out.println(contador);
            contador++;
        } while (contador < 10);
    }
}
