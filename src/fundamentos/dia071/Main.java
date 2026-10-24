package fundamentos.dia071;

public class Main {
    static void main(String[] args) {

        Veiculo focus = new Veiculo("Ford", "Focus", 2009, 60.0);
        Veiculo civic = new Veiculo("Honda", "Civic", 2011, 90.0);

        System.out.println("=== VEÍCULO 1 ===");
        System.out.println("Marca: " + focus.getMarca());
        System.out.println("Modelo: " + focus.getModelo());
        System.out.println("Ano: " + focus.getAno());
        System.out.println("Velocidade: " + focus.getVelocidade() + "km/h");
        System.out.println(focus.apresentarVeiculo());

        System.out.println("");

        System.out.println("=== VEÍCULO 2 ===");
        System.out.println("Marca: " + civic.getMarca());
        System.out.println("Modelo: " + civic.getModelo());
        System.out.println("Ano: " + civic.getAno());
        System.out.println("Velocidade: " + civic.getVelocidade() + "km/h");
        System.out.println(civic.apresentarVeiculo());

        System.out.println("");

        focus.setVelocidade(80.0);

        System.out.println("=== VELOCIDADE ATUALIZADA ===");
        System.out.println("Ford focus: " + focus.getVelocidade() + "km/h");
    }
}
