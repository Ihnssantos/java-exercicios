package poo.dia072;

public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    public void emitirSom() {
        super.emitirSom();
        System.out.println("O cachorro latiu.");
    }
}
