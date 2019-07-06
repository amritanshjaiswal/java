import java.util.ArrayList;
/**
 * Write a description of class GarlandApplication here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GarlandApplication
{
   public static void main (String arg[]){
       ArrayList myGarland = new ArrayList();
    
       Flower rose =new Flower();
       rose.setName("ROSE");
       rose.setColour("RED");
       rose.setSmell("ROSY");
       
       Flower lilly =new Flower("LILLY","WHITE","lilly");
       lilly.setSmell("Smell - Lilly");
       
       myGarland.add(rose);
       myGarland.add(lilly);
       myGarland.add(rose);
       myGarland.add(lilly);
       myGarland.add(rose);
       myGarland.add(lilly);
       //System.out.println(rose);
       //System.out.println(lilly);
       showGarland(myGarland);
       
       
   
    }
    
    private static void showGarland(ArrayList myGarland){
        for(int i=0;i<myGarland.size();i++){
            Object obj=myGarland.get(i);
            Flower f=(Flower)obj;
            System.out.print(f.getName()+"-");
        }
    }
}
