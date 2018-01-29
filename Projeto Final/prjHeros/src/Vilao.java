/* @author Vitu e Debs */
public class Vilao extends Personagem {
    private int tempoDePrisao;

    public int getTempoDePrisao() {
        return tempoDePrisao;
    }

    public void setTempoDePrisao(int tempoDePrisao) {
        this.tempoDePrisao = tempoDePrisao;
    }

    public Vilao(int tempoDePrisao, String nome, String nomeVidaReal, double pontuacao) {
        super(nome, nomeVidaReal, pontuacao);
        this.tempoDePrisao = tempoDePrisao;
    }
}
