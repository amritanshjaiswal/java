// hjgy6rgcj
import java.io.*;

public class LengendNoobDevFootKillingTurdNugget{

    public static void main(String agrs[]){
        System.out.println("Amrit: Dev the noobly noob killing foot!!");
        Person person1=new Person();
        person1.name="Amrit";
        person1.dob="05-Jan-2006";
        person1.gender="Male";

        Person person2=new Person();
        person2.name="Vijay";
        person2.dob="13-Jul-1979";
        person2.gender="Male";

        person1.printMe();
        person2.printMe();

        int j=person1.jump();
        System.out.println("Person1 Jumped: "+j);
        int j1=person2.jump();
        System.out.println("Person2 Jumped: "+j);                                                  
    }
    
    private static void readFile(){
       File file=new File("Amrit.txt");
    }

}

