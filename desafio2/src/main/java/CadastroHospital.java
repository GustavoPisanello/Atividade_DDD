import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class CadastroHospital implements CadastroHospitalInterface {
    Scanner scanner = new Scanner(System.in);
    List<Pessoa> pessoas = new ArrayList<>();

    enum GrauDeficiencia {
        LEVE,
        MODERADO,
        SEVERO
    }

    @Override
    public void cadastrarPessoa() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = 0;
        try{
            idade = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Idade inválida. Por favor, insira um número inteiro.");
            scanner.next();
            cadastrarPessoa();
        }

        scanner.nextLine();
        System.out.print("Tipo de deficiência: ");
        String tipo = scanner.nextLine();


        System.out.print("Grau (leve, moderado, severo): ");
        String grau;

        while (true) {
            String input = scanner.nextLine().toUpperCase();
            if (Objects.equals(input, GrauDeficiencia.LEVE.toString()) || Objects.equals(input, GrauDeficiencia.MODERADO.toString()) || Objects.equals(input, GrauDeficiencia.SEVERO.toString())) {
                grau = input;
                break;
            } else {
                System.out.print("Grau inválido. Por favor, insira leve, moderado ou severo: ");
            }
        }

        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        pessoas.add(new Pessoa(nome, idade, tipo, grau, endereco));
        System.out.println("Pessoa cadastrada com sucesso!");
    }

    public void listarPessoas(){
        System.out.println("Filtrar por tipo de deficiência (ou pressione Enter para listar todos):");
        String tipoFiltro = scanner.nextLine().trim();
        System.out.print("Filtrar por grau (ou pressione Enter para ignorar): ");
        String grauFiltro = scanner.nextLine().trim();

        for (Pessoa p: pessoas){
            if((!tipoFiltro.isEmpty() || !p.tipoDeficiencia.equalsIgnoreCase(tipoFiltro)) || !grauFiltro.isEmpty() || !p.grau.equalsIgnoreCase(grauFiltro)){
                continue;
            }
            System.out.println("Nome: " + p.nome);
            System.out.println("Idade: " + p.idade);
            System.out.println("Tipo de deficiência: " + p.tipoDeficiencia);
            System.out.println("Grau: " + p.grau);
            System.out.println("Endereço: " + p.endereco);
        }
    }

    @Override
    public void registrarAtendimento(){
        if(pessoas.isEmpty()){
            System.out.println("Nenhuma pessoa cadastrada.");
            return;
        }

        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println((i + 1) + ". " + pessoas.get(i).nome);
        }
        System.out.println("Escolha uma pessoa para registrar o atendimento:  ");
        int i = scanner.nextInt() - 1;
        scanner.nextLine();

        System.out.println("Data do atendimento (AAAA-MM-DD): ");
        LocalDate dataAtendimento = LocalDate.parse(scanner.nextLine());
        System.out.println("Tipo de atendimento: ");
        String tipo = scanner.nextLine();
        System.out.println("Profissional responsável:");
        String profissional = scanner.nextLine();

        pessoas.get(i).adicionarAtendimento(new Atendimento(tipo, dataAtendimento, profissional));
        System.out.println("Atendimento registrado com sucesso!");
    }

    @Override
    public void gerarRelatorio(){
        for (Pessoa p: pessoas){
            System.out.print("\n=== Relatório de atendimentos para" + p.nome + "===\n");
            if(p.atendimentos.isEmpty()){
                System.out.println("Nenhum atendimento cadastrado.");
            } else{
                for (Atendimento a: p.atendimentos){
                    System.out.println("Data do atendimento: " + a.data);
                    System.out.println("Especialidade: " + a.especialidade);
                    System.out.println("Responsável pelo atendimento: " + a.nomeProfissional);
                }
            }
        }
    }
}