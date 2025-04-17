import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Exemplo de uso das classes

        Jogadora jogadora1 = new Jogadora("Maria", 25, "Atacante", "10");
        Jogadora jogadora2 = new Jogadora("Ana", 22, "Zagueira", "5");
        Jogadora jogadora3 = new Jogadora("Marta", 22, "Ponta Esquerda", "14");
        Jogadora jogadora4 = new Jogadora("Júlia", 22, "Centro-avante", "7");
        Jogadora jogadora5 = new Jogadora("Júlia", 22, "Goleira", "7");
        Jogadora jogadora6 = new Jogadora("Júlia", 22, "Lateral Direita", "7");

        Time time1 = new Time("Palmeiras", "São Paulo");
        Time time2 = new Time("Vasco da Gama", "Rio de Janeiro");
        Time time3 = new Time("Flamengo", "Rio de Janeiro");

        time1.adicionarJogadora(jogadora1);
        time1.adicionarJogadora(jogadora2);
        time2.adicionarJogadora(jogadora3);
        time2.adicionarJogadora(jogadora4);
        time3.adicionarJogadora(jogadora5);
        time3.adicionarJogadora(jogadora6);

        Jogo jogo1 = new Jogo(time1, time2, 2, 1);

        Jogo jogo2 = new Jogo(time1, time2, 1, 2);

        Jogo jogo3 = new Jogo(time1, time2, 0, 3);

        Jogo jogo4 = new Jogo(time1, time3, 4, 1);

        Campeonato campeonato1 = new Campeonato("Campeonato Brasileiro");
        campeonato1.adicionarTime(time1);
        campeonato1.adicionarTime(time2);
        campeonato1.adicionarTime(time3);
        campeonato1.adicionarJogo(jogo1);
        campeonato1.adicionarJogo(jogo3);
        campeonato1.adicionarJogo(jogo4);
        campeonato1.mostrarTabela();

        System.out.println("\n");

        Campeonato campeonato2 = new Campeonato("Libertadores");
        campeonato2.adicionarTime(time1);
        campeonato2.adicionarTime(time2);
        campeonato2.adicionarJogo(jogo2);
        campeonato2.mostrarTabela();

    }
}