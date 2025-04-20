import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<PracaPedagio> pracas = new ArrayList<>();

        pracas.add(new PracaPedagio("Anhanguera - km 250", 10.0));
        pracas.add(new PracaPedagio("Castelo Branco - km 50", 5));

        int opcao;
        do {
            System.out.println("\n1. Registrar passagem");
            System.out.println("2. Relatório por praça");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Escolha a praça:");
                    for (int i = 0; i < pracas.size(); i++) {
                        System.out.println(i + ". " + pracas.get(i).local);
                    }
                    int indice = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Tipo (carro/moto/caminhao): ");
                    String tipo = scanner.nextLine();
                    if(tipo.equals("caminhão")){
                        tipo = "caminhao";
                    }
                    System.out.print("Placa: ");
                    String placa = scanner.nextLine();
                    Veiculo veiculo = null;

                    System.out.print("Modelo: ");
                    String modelo = scanner.nextLine();

                    switch (tipo.toLowerCase()) {
                        case "carro" -> veiculo = new Carro(placa, modelo);
                        case "moto" -> veiculo = new Moto(placa, modelo);
                        case "caminhao" -> {
                            System.out.print("Número de eixos: ");
                            int eixos = scanner.nextInt();
                            scanner.nextLine();
                            veiculo = new Caminhao(placa, eixos, modelo);
                        }
                        default -> System.out.println("Tipo inválido.");
                    }
                    if (veiculo != null) {
                        pracas.get(indice).registrarPassagem(veiculo);
                    }
                }
                case 2 -> {
                    for (PracaPedagio p : pracas) {
                        p.gerarRelatorio();
                    }
                }
            }
        } while (opcao != 0);
    }
}