
/**
 * Write a description of class Car here.
 *
 * @author Amritansh
 * @version 0.0.1
 */
public class Car 
{
    // instance variables - replace the example below with your own
    private int milageRan=0;
    private String color;
    private String model;
   
    // Constructor without parameter
    public Car(){
      super();
      
    }
    // Constructor with 2 parameter (color and model)
    public Car(String c1, String m1){
      super();
      this.color=c1;
      this.model=m1;
            
    }

     public int journy()
    {
        // put your code here
         System.out.println("Starting journy...");
        describe();
        milageRan=milageRan+10;
        System.out.println("Stopping journy...");
        describe();
        return milageRan;
    }
    private void describe()
    {
        // put your code here
        System.out.println("My color is: "+color);
        System.out.println("My model is: "+model);
        System.out.println("I have ran : "+milageRan+" kms.");
    }
    // Getter - Return attributes current state 
    public String getModel(){
        return this.model;
    }
     // Setter - Update attributes current state 
    public void setModel(String m1){
        this.model=m1;
    }
}
