import java.util.ArrayList;
import java.util.List;

public class PracaPedagio implements PracaPedagioInterface{
    public String local;
    private double tarifaBase;
    private List<RegistroPassagem> registros = new ArrayList<>();

    public PracaPedagio(String local, double tarifaBase) {
        this.local = local;
        this.tarifaBase = tarifaBase;
    }

    @Override
    public void registrarPassagem(Veiculo v) {
        double valor = v.calcularPedagio(tarifaBase);
        registros.add(new RegistroPassagem(v, valor));
        System.out.printf("Veículo %s passou por %s - Valor cobrado: R$ %.2f\n", v.getPlaca(), local, valor);
    }

    @Override
    public void gerarRelatorio(){
        System.out.printf("\n--- Relatório da praça de pedágio %s: ---\n", local);
        double total = 0;
        if(!registros.isEmpty()) {
            for (RegistroPassagem registro : registros) {
                System.out.printf("Placa do veículo: %s - Modelo: %s - Valor cobrado: R$ %.2f\n", registro.v.getPlaca(), registro.v.getModelo(), registro.valor);
                total += registro.valor;
            }
            System.out.printf("Total arrecadado: R$ %.2f\n", total);
        } else{
            System.out.println("Nenhum registro encontrado.");
        }
    }
}
