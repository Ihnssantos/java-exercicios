package fundamentos.dia081;

public class Main {
    static void main(String[] args) {

        Produto notebook = new Produto("Notebook", 3500.0, 6);
        Produto teclado = new Produto("Teclado", 400.0, 1);

        System.out.println(notebook.apresentarProduto());
        System.out.println(teclado.apresentarProduto());

        notebook.removerEstoque(3);
        teclado.removerEstoque(3);//inválido

        notebook.adicionarEstoque(2);//5
        teclado.adicionarEstoque(-2);//inválido

        notebook.aplicarDesconto(5.00);
        teclado.aplicarDesconto(101.0);//inválido

        System.out.println(notebook.apresentarProduto());
        System.out.println(teclado.apresentarProduto());
    }
}
