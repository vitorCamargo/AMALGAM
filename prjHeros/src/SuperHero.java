/* @author Vitu e Debs */
public class SuperHero extends Character {

    public SuperHero(String name, String realLifeName, double pontuation) {
        super(name, realLifeName, pontuation);
    }
    
    public double getTotalPower() {
        double totalPower;
        
        totalPower = 1.856 * (getPontuation() * getPontuation());
        
        return totalPower + totalPower * 0.1;
    }
}
