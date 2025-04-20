import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculoPedagioTest {
    double tarifaBase = 10;

    @Test
    public void testCalculoPedagioCarro() {
        Carro carro = new Carro("ABC1234", "Fusca");
        double valorEsperado = tarifaBase;
        double valorCalculado = carro.calcularPedagio(tarifaBase);
        assertEquals(valorEsperado, valorCalculado, 0.01);
    }

    @Test
    public void testCalculoPedagioMoto() {
        Moto moto = new Moto("ABC1234", "Yamaha Fazer");
        double valorEsperado = tarifaBase * 0.5;
        double valorCalculado = moto.calcularPedagio(tarifaBase);
        assertEquals(valorEsperado, valorCalculado, 0.01);
    }

    @Test
    public void testCalculoPedagioCaminhao() {
        Caminhao caminhao = new Caminhao("ABC1234",3, "Scania R450");
        double valorEsperado = tarifaBase * 3;
        double valorCalculado = caminhao.calcularPedagio(tarifaBase);
        assertEquals(valorEsperado, valorCalculado, 0.01);
    }
}
