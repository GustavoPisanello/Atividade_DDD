import java.util.List;

public class Jogo implements JogoInterface {
    public int golsTimeA;
    public int golsTimeB;
    public Time timeA;
    public Time timeB;
    public List<Time> times;

    public Jogo(Time timeA, Time timeB, int golsTimeA, int golsTimeB) {
        this.timeA = timeA;
        this.timeB = timeB;
        this.golsTimeA = golsTimeA;
        this.golsTimeB = golsTimeB;
        atualizaPlacar();
    }

    @Override
    public void atualizaPlacar(){
        assert timeB != null;
        assert timeA != null;

        if(golsTimeA == golsTimeB){
            timeA.pontos += 1;
            timeB.pontos += 1;
        } else if(golsTimeA > golsTimeB){
            timeA.pontos += 3;
        } else {
            timeB.pontos += 3;
        }
    }
}
