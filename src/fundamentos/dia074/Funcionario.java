package fundamentos.dia074;

public class Funcionario {

    private String nome;
    private double salario;
    private Departamento departamento;


    public Funcionario(String nome, double salario, Departamento departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public String apresentarFuncionario() {
        return "Nome: " + nome + " |Salário: " + salario + " |Departamento: " + departamento.getNome();
    }
}
