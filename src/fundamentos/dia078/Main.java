package fundamentos.dia078;

public class Main {
    static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Carlos", 3000.0);
        Funcionario funcionario2 = new Desenvolvedor("Igor", 4000.0, "Java");
        Funcionario funcionario3 = new Gerente("Maria", 7000.0, "Tecnologia");

        System.out.println(funcionario1.apresentarFuncionario());
        System.out.println(funcionario2.apresentarFuncionario());
        System.out.println(funcionario3.apresentarFuncionario());
    }
}
