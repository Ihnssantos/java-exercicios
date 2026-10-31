package fundamentos.dia083;

public class Livro {

    private String titulo;
    private String autor;
    private boolean disponivel;


    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void marcarComoDisponivel() {
        disponivel = true;
    }

    public void marcarComoEmprestado() {
        disponivel = false;
    }
}
