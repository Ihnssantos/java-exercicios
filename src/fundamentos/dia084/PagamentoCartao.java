package fundamentos.dia084;

public class PagamentoCartao extends PagamentoBase{

    public PagamentoCartao(double valor) {
        super(valor);
    }

    @Override
    public double calcularValorFinal() {
        return getValor() + (getValor() * 0.05);
    }

    @Override
    public String getFormaPagamento() {
        return "Cartão de Crédito";
    }
}
