package fundamentos.dia084;

public class PagamentoPix extends PagamentoBase{

    public PagamentoPix(double valor) {
        super(valor);
    }

    @Override
    public double calcularValorFinal() {
        return getValor() - (getValor() * 0.10);
    }

    @Override
    public String getFormaPagamento() {
        return "PIX";
    }
}
