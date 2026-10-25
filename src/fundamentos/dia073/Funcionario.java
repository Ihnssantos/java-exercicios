package fundamentos.dia073;

public class Funcionario {

    private String nome;
    private String cargo;
    private double salario;


    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentarSalario(double valor) {
        if (valor > 0) {
            salario += valor;
            System.out.println("Aumento realizado!");
        } else {
            System.out.println("Aumento inválido!");
        }
    }

    public String apresentarFuncionario() {
        return "|Nome: " + nome + " |Cargo: " + cargo + " |Salario: " + salario;
    }


}
