/* @author Vitu e Debs */
public class SuperHeroi extends Personagem {

    public SuperHeroi(String nome, String nomeVidaReal, double pontuacao) {
        super(nome, nomeVidaReal, pontuacao);
    }
    
    public double getPoderTotal(){
        double poderTotal;
        
        poderTotal = 1.856 * (getPontuacao() * getPontuacao());
        
        return poderTotal + poderTotal * 0.1;
    }
}
