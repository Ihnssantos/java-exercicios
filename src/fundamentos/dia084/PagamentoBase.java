package fundamentos.dia084;

abstract class PagamentoBase implements Pagamento {

    private double valor;

    public PagamentoBase(double valor) {
        if (valor < 0) {
            this.valor = 0;
        } else {
            this.valor = valor;
        }
    }

    public double getValor() {
        return valor;
    }
}
