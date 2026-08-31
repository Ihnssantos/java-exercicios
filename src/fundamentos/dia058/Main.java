package fundamentos.dia058;

public class Main {
    static void main(String[] args) {

        String mensagem = criarMensagem("Igor");

        System.out.println(mensagem);
    }

    static String criarMensagem(String nome) {
        return "Olá, " + nome + "! Seja bem-vindo ao Java!";
    }
}
