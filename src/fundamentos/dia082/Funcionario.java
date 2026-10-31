package fundamentos.dia082;

public class Funcionario {

    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double calcularSalarioFinal() {
        return salarioBase;
    }

    public String apresentarFuncionario() {
        return "Nome: " + getNome() + " | Salário base: " + getSalarioBase() + " | Salário final: " + calcularSalarioFinal();
    }
}
