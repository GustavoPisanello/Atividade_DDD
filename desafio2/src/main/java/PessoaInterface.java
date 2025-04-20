import java.util.List;

public interface PessoaInterface {
    void adicionarAtendimento(Atendimento atendimento);
    List<Atendimento> getAtendimentos();
}
