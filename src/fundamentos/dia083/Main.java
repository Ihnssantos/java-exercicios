package fundamentos.dia083;

public class Main {
    static void main(String[] args) {

        Livro livro1 = new Livro("Clean Code", "Robert C. Martin");
        Leitor leitor1 = new Leitor("Igor", "igor@gmail.com");
        Emprestimo emprestimo = new Emprestimo(livro1, leitor1);

        System.out.println(livro1.isDisponivel());
        emprestimo.realizarEmprestimo();
        System.out.println(livro1.isDisponivel());
        emprestimo.realizarEmprestimo();
        emprestimo.devolverLivro();
        System.out.println(livro1.isDisponivel());
        emprestimo.devolverLivro();
        emprestimo.realizarEmprestimo();
        System.out.println(livro1.isDisponivel());
        emprestimo.devolverLivro();

    }
}
