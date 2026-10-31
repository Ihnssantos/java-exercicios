package fundamentos.dia082;

public class Main {
    static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Carlos", 3000.0);
        Funcionario desenvolvedor = new Desenvolvedor("Igor", 4000.0, 15);
        Funcionario gerente = new Gerente("Maria", 7000.0, 25);
        Funcionario desenvolvedorTeste = new Desenvolvedor("Teste", 1500.0, 40);

        System.out.println(funcionario.apresentarFuncionario());
        System.out.println(desenvolvedor.apresentarFuncionario());
        System.out.println(gerente.apresentarFuncionario());
        System.out.println(desenvolvedorTeste.apresentarFuncionario());
    }
}
