package fundamentos.dia053;

public class Main {
    static void main(String[] args) {

        String nome = "Igor";
        String nomeBusca = "Igor";
        String frase = "Eu estou estudando Java";
        String contem = "Java";

        System.out.println("==== ANÁLISE DE STRINGS ====");

        System.out.println("");

        System.out.println("Nome: " + nome);
        System.out.println("Maiúsculo: " + nome.toUpperCase());
        System.out.println("Minúsculo: " + nome.toLowerCase());
        System.out.println("Quantidade de caracteres: " + nome.length());
        System.out.println("Primeiro caractere: " + nome.charAt(0));

        System.out.println("");

        if (nome.equals(nomeBusca)) {
            System.out.println("Os nomes são iguais!");
        } else {
            System.out.println("Os nomes são diferentes!");
        }

        System.out.println("");

        if (frase.contains(contem)) {
            System.out.println("A frase contém " + contem + "!");
        } else {
            System.out.println("A frase não contém " + contem + "!");
        }

        System.out.println("");

        System.out.println("=============================");
    }
}
