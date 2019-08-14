/* @author Vitu e Debs */
public class Vilan extends Character {
    private int timeOfPrison;

    public int getTimeOfPrison() {
        return timeOfPrison;
    }

    public void setTimeOfPrisono(int timeOfPrison) {
        this.timeOfPrison = timeOfPrison;
    }

    public Vilan(int timeOfPrison, String name, String realLifeName, double pontuation) {
        super(name, realLifeName, pontuation);
        this.setPontuation(pontuation);
    }
}
