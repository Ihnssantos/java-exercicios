package fundamentos.dia069;

public class Main {
    static void main(String[] args) {

        Produto produto1 = new Produto("Notebook", 3500.00, 10);

        System.out.println("Produto: " + produto1.getNome());
        System.out.println("Preço: " + produto1.getPreco());
        System.out.println("Disponível no estoque: " + produto1.getEstoque());

        produto1.setEstoque(9);

        System.out.println("Disponível no estoque: " + produto1.getEstoque());
    }
}
