
/**
 * Write a description of class Flower here.
 *
 * @author Amritansh Jaiswal
 * @version 0.0.1
 */
public class Flower
{
    // instance variables - replace the example below with your own
    private int decorate;
    private String colour;
    private String smell;
    private String name;
   //Constructor without parameter
    public Flower()
    {
      super(); 
        
    }
    //Constuctor with parameter
    public Flower(String n1, String c2,String s1){
    super();
    this.name=n1;
    this.colour=c2;
    this.smell=s1;
}

    public int decoration()
   {
        //enter your code here
        describe();
        decorate=decorate+15;
        describe();
        return decorate;
    }   
    private void  describe()
    {
        //enter your code here
            System.out.println("My colour is: "+colour);
            System.out.println("My smell is: "+smell);
            System.out.println("For decoration: "+decorate+" flower");
        }
      //Gettter-Return attributes current state 
        public String getSmell(){
            return this.smell;
        }

        //Setter-Update attributes current state
        public void setSmell(String s1) {
            this.smell=s1;
        }
        //Getter-for colour
        public String getColour(){
            return this.colour;
        }
        //Setter-for colour
        public void setColour(String c2){
            this.colour=c2;
        }
         //Getter-for name
        public String getName(){
            return this.name;
        }
        //Setter-for name
        public void setName(String n1){
            this.name=n1;
        }
        public String toString(){
            return this.name+"("+this.colour+", "+this.smell+")";
        }
        
    }      
            