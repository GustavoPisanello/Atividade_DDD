import java.time.LocalDate;

public class Atendimento {
    String especialidade;
    LocalDate data;
    String nomeProfissional;

    public Atendimento(String especialidade, LocalDate data, String nomeProfissional) {
        this.especialidade = especialidade;
        this.data = data;
        this.nomeProfissional = nomeProfissional;
    }
}
