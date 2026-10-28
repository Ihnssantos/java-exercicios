package fundamentos.dia077;

public class Desenvolvedor extends Funcionario {

    private String linguagem;


    public Desenvolvedor(String nome, double salario, String linguagem) {
        super(nome, salario);
        this.linguagem = linguagem;
    }

    @Override
    public String apresentarFuncionario() {
        return "Nome: " + nome + " | Salário: " + salario + " | Linguagem: " + linguagem;
    }
}
