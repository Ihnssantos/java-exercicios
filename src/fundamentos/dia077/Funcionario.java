package fundamentos.dia077;

public class Funcionario {

    protected String nome;
    protected double salario;


    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String apresentarFuncionario() {
        return "Nome: " + nome + " | Salário: " + salario;
    }
}
