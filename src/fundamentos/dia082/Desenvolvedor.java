package fundamentos.dia082;

public class Desenvolvedor extends Funcionario{

    private double percentualProdutividade;

    public Desenvolvedor(String nome, double salarioBase, double percentualProdutividade) {
        super(nome, salarioBase);

        if (percentualProdutividade < 0 || percentualProdutividade > 30) {
            this.percentualProdutividade = 0;
        } else {
            this.percentualProdutividade = percentualProdutividade;
        }
    }

    @Override
    public double calcularSalarioFinal() {
        double bonus = getSalarioBase() * (percentualProdutividade / 100);
        return getSalarioBase() + bonus;
    }
}
