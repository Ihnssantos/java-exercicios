package fundamentos.dia052;

public class Main {
    static void main(String[] args) {

        String frase = "Eu estou estudando Java";
        String contem = "Java";

        System.out.println("==== BUSCA NA STRING ====");

        System.out.println("");

        if (frase.contains(contem)) {
            System.out.println("A frase contém " + contem + "!");
        } else {
            System.out.println("A frase não contém " + contem + "!");
        }

        System.out.println("");

        System.out.println("========================");
    }
}
