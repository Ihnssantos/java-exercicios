package fundamentos.dia075;

public class Processador {

    private String modelo;
    private int nucleos;


    public Processador(String modelo, int nucleos) {
        this.modelo = modelo;
        this.nucleos = nucleos;
    }

    public String getModelo() {
        return modelo;
    }

    public int getNucleos() {
        return nucleos;
    }
}
