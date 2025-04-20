import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JogoTeste {

    @Test
    public void atualizaPlacarTeste(){
        Time timeA = new Time("Time A", "São Paulo");
        Time timeB = new Time("Time B", "Rio de Janeiro");
        Jogo jogo = new Jogo(timeA, timeB, 2, 1);
        jogo.atualizaPlacar();
        assertEquals(3, jogo.timeA.pontos);
    }
}
