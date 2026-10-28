package fundamentos.dia076;

public class Main {
    static void main(String[] args) {

        Desenvolvedor dev1 = new Desenvolvedor("Igor", 4000.0, "Java");

        System.out.println(dev1.apresentarFuncionario());

        System.out.println("Linguagem: " + dev1.getLinguagem());

    }
}
