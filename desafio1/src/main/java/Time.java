import java.util.ArrayList;
import java.util.List;

public class Time implements TimeInterface {
    public String nome;
    private String cidade;
    public List<Jogadora> jogadoras = new ArrayList<>();
    public int pontos;

    public Time(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    @Override
    public void adicionarJogadora(Jogadora jogadora) {
        jogadoras.add(jogadora);
    }

    @Override
    public int getPontos() {
        return pontos;
    }

    public void getJogadoras(){
        for (Jogadora jogadora: jogadoras){
            System.out.println(jogadora);
        }
    }

}
