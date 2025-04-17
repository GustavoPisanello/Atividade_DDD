import java.util.ArrayList;
import java.util.List;

public class Campeonato implements CampeonatoInterface{
    private String nome;
    private List<Jogo> jogos = new ArrayList<>();
    private List<Time> times = new ArrayList<>();

    public Campeonato(String nome) {
        this.nome = nome;
    }

    @Override
    public void adicionarTime(Time time) {
        time.pontos = 0;
        times.add(time);
    }

    @Override
    public void adicionarJogo(Jogo jogo) {
        jogos.add(jogo);
        jogo.atualizaPlacar();
    }

    @Override
    public void mostrarTabela() {
        System.out.println(nome);
        for (Time time: times){
            System.out.println("Time: " + time.nome + " | Pontos: " + time.getPontos());
        }
    }



}
