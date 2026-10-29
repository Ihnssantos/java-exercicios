package fundamentos.dia080;

public class PagamentoCartao implements Pagamento{

    @Override
    public void pagar(double valor) {
        valor = valor * 1.05;
        System.out.println("Pagamento realizado via cartão: R$ " + valor);
    }
}
