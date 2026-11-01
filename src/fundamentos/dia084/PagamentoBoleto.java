package fundamentos.dia084;

public class PagamentoBoleto extends PagamentoBase{

    public PagamentoBoleto(double valor) {
        super(valor);
    }

    @Override
    public double calcularValorFinal() {
        return getValor();
    }

    @Override
    public String getFormaPagamento() {
        return "Boleto";
    }
}
