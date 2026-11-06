package fundamentos.dia088;

public class Main {
    static void main(String[] args) {

        Caixa<String> caixaTexto = new Caixa<>("Java");
        Caixa<Integer> caixaNumero = new Caixa<>(100);
        Caixa<Double> caixaPreco = new Caixa<>(49.90);

        System.out.println(caixaTexto.getConteudo());
        System.out.println(caixaNumero.getConteudo());
        System.out.println(caixaPreco.getConteudo());

        caixaTexto.setConteudo("Spring Boot");

        System.out.println(caixaTexto.getConteudo());
    }
}
