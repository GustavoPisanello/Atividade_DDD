import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Exemplo de uso das classes

        Jogadora jogadora1 = new Jogadora("Maria", 25, "Atacante", "10");
        Jogadora jogadora2 = new Jogadora("Ana", 22, "Defensora", "5");
        Jogadora jogadora3 = new Jogadora("Marta", 22, "Ponta Esquerda", "14");
        Jogadora jogadora4 = new Jogadora("Júlia", 22, "Centro-avante", "7");

        Time time1 = new Time("Palmeiras", "São Paulo");
        Time time2 = new Time("Vasco da Gama", "Rio de Janeiro");

        time1.adicionarJogadora(jogadora1);
        time1.adicionarJogadora(jogadora2);
        time2.adicionarJogadora(jogadora3);
        time2.adicionarJogadora(jogadora4);

        Jogo jogo1 = new Jogo(time1, time2, 2, 1);



    }
}