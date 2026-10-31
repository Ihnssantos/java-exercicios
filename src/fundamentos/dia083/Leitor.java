package fundamentos.dia083;

public class Leitor {

    private String nome;
    private String email;


    public Leitor(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
