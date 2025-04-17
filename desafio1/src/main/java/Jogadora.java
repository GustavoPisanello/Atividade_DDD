public class Jogadora {
    private String nome;
    private int idade;
    private String posicao;
    private String numCamisa;

    public Jogadora(String nome, int idade, String posicao, String numCamisa) {
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
        this.numCamisa = numCamisa;
    }

    @Override
    public String toString() {
        return "Jogadora: " + nome + " | Idade: " + idade + " | Posição: " + posicao + " | Número da Camisa: " + numCamisa;
    }
}
