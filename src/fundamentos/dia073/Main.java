package fundamentos.dia073;

public class Main {
    static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Igor", "Desenvolvedor", 3000.0);

        System.out.println(funcionario1.apresentarFuncionario());

        funcionario1.aumentarSalario(500);

        funcionario1.aumentarSalario(-200);

        System.out.println(funcionario1.apresentarFuncionario());
    }
}
