package fundamentos.dia070;

public class Main {
    static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Igor", "Desenvolvedor fullstack", 4500.0);

        System.out.println("=== Funcionário ===");

        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Cargo: " + funcionario1.getCargo());
        System.out.println("Salário: R$" + funcionario1.getSalario());

        System.out.println(funcionario1.apresentarStack());
    }
}
