package fundamentos.dia051;

public class Main {
    static void main(String[] args) {

        String nome = "Igor";
        String nomeBuscado = "Igor";

        System.out.println("==== COMPARAÇÃO DE STRINGS ====");

        System.out.println("");

        System.out.println("Nome: " + nome);
        System.out.println("Nome buscado: " + nomeBuscado);

        System.out.println("");

        if (nome.equals(nomeBuscado)) {
            System.out.println("Os nomes são iguais!");
        } else {
            System.out.println("Os nomes são diferentes!");
        }

        System.out.println("");

        System.out.println("================================");


    }
}
