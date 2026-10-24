package fundamentos.dia071;

public class Veiculo {

    String marca;
    String modelo;
    int ano;
    double velocidade;


    public Veiculo(String marca, String modelo, int ano, double velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    public String apresentarVeiculo() {
        return "Marca: " + marca + " |Modelo: " + modelo + " |Ano: " + ano + " |Velocidade: " + velocidade;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getVelocidade() {
        return velocidade;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}
