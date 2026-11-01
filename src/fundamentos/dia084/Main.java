package fundamentos.dia084;

public class Main {
    static void main(String[] args) {

        Pagamento pix = new PagamentoPix(1000.0);
        Pagamento pixInvalido = new PagamentoPix(-500);
        Pagamento cartao = new PagamentoCartao(1000.0);
        Pagamento boleto = new PagamentoBoleto(1000.0);

        System.out.println(pix.getFormaPagamento() + ": " + pix.calcularValorFinal());
        System.out.println(pixInvalido.getFormaPagamento() + ": " + pixInvalido.calcularValorFinal());
        System.out.println(cartao.getFormaPagamento() + ": " + cartao.calcularValorFinal());
        System.out.println(boleto.getFormaPagamento() + ": " + boleto.calcularValorFinal());
    }
}