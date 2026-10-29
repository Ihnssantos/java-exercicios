package fundamentos.dia079;

public class Main {
    static void main(String[] args) {

        Funcionario funcionario1 = new Desenvolvedor("Igor", 4000.0);

        Funcionario funcionario2 = new Gerente("Maria", 7000.0);

        System.out.println("Bônus: R$ " + funcionario1.apresentarFuncionario());
        System.out.println("Bônus: R$ " + funcionario2.apresentarFuncionario());
    }
}
