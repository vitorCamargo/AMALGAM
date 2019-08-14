/* @author Vitu e Debs */
public abstract class Character {
    private String name;
    private String realLifeName;
    private double pontuation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealLifeName() {
        return realLifeName;
    }

    public void setRealLifeName(String realLifeName) {
        this.realLifeName = realLifeName;
    }

    public double getPontuation() {
        return pontuation;
    }

    public void setPontuation(double pontuation) {
        this.pontuation = pontuation;
    }

    public Character(String name, String realLifeName, double pontuation) {
        this.name = name;
        this.realLifeName = realLifeName;
        this.pontuation = pontuation;
    }
    
    public double getTotalPower() {
        double totalPower;
        
        totalPower = 1.856 * (this.pontuation * this.pontuation);
        
        return totalPower;
    }
}
