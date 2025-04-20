public class Caminhao implements Veiculo{
    private String placa;
    private int eixos;
    public String modelo;

    public Caminhao(String placa, int eixos, String modelo) {
        this.placa = placa;
        this.eixos = eixos;
        this.modelo = modelo;
    }

    @Override
    public String getPlaca() {
        return placa;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public double calcularPedagio(double tarifaBase) {
        return tarifaBase * eixos;
    }
}
