package fundamentos.dia077;

public class Main {
    static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Carlos", 3000.0);

        Desenvolvedor desenvolvedor1 = new Desenvolvedor("Igor", 4000.0, "Java");

        System.out.println(funcionario1.apresentarFuncionario());

        System.out.println(desenvolvedor1.apresentarFuncionario());
    }
}
