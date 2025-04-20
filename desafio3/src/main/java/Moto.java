public class Moto implements Veiculo{
    private String placa;
    private String modelo;

    public Moto(String placa, String modelo) {
        this.placa = placa;
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
        return tarifaBase * 0.5;
    }
}
