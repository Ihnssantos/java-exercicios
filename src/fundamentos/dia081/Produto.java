package fundamentos.dia081;

public class Produto {

    private String nome;
    private double preco;
    private int estoque;


    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;

        if (preco < 0) {
            System.out.println("Preço inválido!");
        } else {
            this.preco = preco;
        }

        if (estoque < 0) {
            System.out.println("Estoque inválido");
        } else {
            this.estoque = estoque;
        }
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida!");
        } else {
            estoque += quantidade;
        }
    }

    public void removerEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida!");
        } else if (quantidade > estoque) {
            System.out.println("Sem estoque necessario!");
        } else {
            estoque -= quantidade;
        }
    }

    public void aplicarDesconto(double percentual) {
        if (percentual < 0.0 || percentual > 100.0) {
            System.out.println("Percentual inválido");
        } else {
            preco = preco - (preco * (percentual / 100));
        }
    }

    public double calcularValorEstoque() {
        return preco * estoque;
    }

    public String apresentarProduto() {
        return "Produto: " + getNome() + " |Preço: " + getPreco() + " |Estoque: " + getEstoque();
    }
}
