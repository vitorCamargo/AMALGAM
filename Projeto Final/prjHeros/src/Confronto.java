/* @author Vitu e Debs */
public class Confronto {
    public int executar(SuperHeroi superheroi, Vilao vilao){
         double ptHeroi = superheroi.getPoderTotal();
         double ptVilao = vilao.getPoderTotal();
        
         if(ptHeroi > ptVilao){
             return 1;
         }
         else if(ptVilao > ptHeroi){
             return 2;
         }
         else {
            return 0;
        }
    }
}
