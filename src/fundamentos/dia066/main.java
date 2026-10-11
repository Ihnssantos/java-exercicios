package fundamentos.dia066;

import java.util.Locale;
import java.util.Scanner;

public class main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();

        char ultimoCaractere = frase.charAt(frase.length() - 1);

        String fraseMinuscula = frase.toLowerCase();
        int quantidadeA = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (fraseMinuscula.charAt(i) == 'a') {
                quantidadeA++;
            }
        }

        System.out.println("");

        System.out.println("=== ANÁLISE DE TEXTO ===");
        System.out.println("Frase original: " + frase);
        System.out.println("Maiúsculas: " + frase.toUpperCase());
        System.out.println("Minúsculas: " + frase.toLowerCase());
        System.out.println("Quantidade de caracteres: " + frase.length());
        System.out.println("Primeiro caractere: " + frase.charAt(0));
        System.out.println("Último caractere: " + ultimoCaractere);
        System.out.println("Contém Java: " + frase.toLowerCase().contains("Java"));
        System.out.println("Quantidade de letras A: " + quantidadeA);
    }
}
