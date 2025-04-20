import java.util.ArrayList;
import java.util.List;

public class Pessoa implements PessoaInterface {
    String nome;
    int idade;
    String tipoDeficiencia;
    String grau;
    String endereco;
    List<Atendimento> atendimentos = new ArrayList<>();

    public Pessoa(String nome, int idade, String tipoDeficiencia, String grau, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.tipoDeficiencia = tipoDeficiencia;
        this.grau = grau;
        this.endereco = endereco;
    }

    @Override
    public void adicionarAtendimento(Atendimento atendimento) {
        this.atendimentos.add(atendimento);
    }

    @Override
    public List<Atendimento> getAtendimentos() {
        return atendimentos;
    }
}
