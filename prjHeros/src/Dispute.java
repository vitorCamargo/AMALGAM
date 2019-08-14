/* @author Vitu e Debs */
public class Dispute {
    public int fight(SuperHero superhero, Vilan vilan) {
         double ptHero = superhero.getTotalPower();
         double ptVilan = vilan.getTotalPower();
        
         if(ptHero > ptVilan) {
            return 1;
         }
         else if(ptVilan > ptHero) {
            return 2;
         }
         else {
            return 0;
        }
    }
}
