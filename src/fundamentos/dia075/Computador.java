package fundamentos.dia075;

public class Computador {

    private String marca;
    private Processador processador;


    public Computador(String marca, String modeloProcessador, int nucleos) {
        this.marca = marca;
        this.processador = new Processador(modeloProcessador, nucleos);
    }

    public String apresentarComputador() {
        return "Marca: " + marca + " |Processador: " + processador.getModelo() + " |Núcleo: " + processador.getNucleos();
    }


}
