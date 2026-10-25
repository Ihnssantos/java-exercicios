package fundamentos.dia074;

public class Main {
    static void main(String[] args) {

        Departamento tecnolgia = new Departamento("Tecnologia");
        Departamento financeiro = new Departamento("Financeiro");

        Funcionario funcionario1 = new Funcionario("Igor", 4000.0, tecnolgia);
        Funcionario funcionario2 = new Funcionario("Maria", 5000.0, financeiro);

        System.out.println(funcionario1.apresentarFuncionario());
        System.out.println(funcionario2.apresentarFuncionario());
    }
}
