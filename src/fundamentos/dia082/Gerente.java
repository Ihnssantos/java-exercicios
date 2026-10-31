package fundamentos.dia082;

public class Gerente extends Funcionario{

    private double percentualLideranca;


    public Gerente(String nome, double salarioBase, double percentualLideranca) {
        super(nome, salarioBase);

        if (percentualLideranca < 0 || percentualLideranca > 50) {
            this.percentualLideranca = 0;
        } else {
            this.percentualLideranca = percentualLideranca;
        }
    }

    @Override
    public double calcularSalarioFinal() {
        double bonus = getSalarioBase() * (percentualLideranca / 100);
        return getSalarioBase() + bonus;

    }
}
