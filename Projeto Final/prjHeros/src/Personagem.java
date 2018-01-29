/* @author Vitu e Debs */
public abstract class Personagem {
    private String nome;
    private String nomeVidaReal;
    private double pontuacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeVidaReal() {
        return nomeVidaReal;
    }

    public void setNomeVidaReal(String nomeVidaReal) {
        this.nomeVidaReal = nomeVidaReal;
    }

    public double getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(double pontuação) {
        this.pontuacao = pontuação;
    }

    public Personagem(String nome, String nomeVidaReal, double pontuacao) {
        this.nome = nome;
        this.nomeVidaReal = nomeVidaReal;
        this.pontuacao = pontuacao;
    }
    
    public double getPoderTotal(){
        double poderTotal;
        
        poderTotal = 1.856 * (this.pontuacao * this.pontuacao);
        
        return poderTotal;
    }
}
