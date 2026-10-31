package fundamentos.dia083;

public class Emprestimo {

    private Livro livro;
    private Leitor leitor;
    private boolean devolvido;
    private boolean ativo;


    public Emprestimo(Livro livro, Leitor leitor) {
        this.livro = livro;
        this.leitor = leitor;
    }

    public void realizarEmprestimo() {
        if (livro.isDisponivel() && ativo == false) {
            livro.marcarComoEmprestado();
            ativo = true;
            devolvido = false;
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Livro ja foi emprestado!");
        }
    }

    public void devolverLivro() {
        if (ativo == true) {
            livro.marcarComoDisponivel();
            ativo = false;
            devolvido = true;
            System.out.println("Livro devolvido com sucesso!");
        } else if (devolvido == true) {
            System.out.println("Livro já foi devolvido");
        } else if (ativo == false) {
            System.out.println("Empréstimo não realizado");
        }
    }
}
