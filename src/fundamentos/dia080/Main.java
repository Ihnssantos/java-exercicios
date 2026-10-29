package fundamentos.dia080;

public class Main {
    static void main(String[] args) {

        Pagamento pagamento1 = new PagamentoPix();
        Pagamento pagamento2 = new PagamentoCartao();

        pagamento1.pagar(200);
        pagamento2.pagar(200);

    }
}
