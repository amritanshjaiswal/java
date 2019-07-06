import java.util.*;
/**
 * Write a description of class ConditionWithoutIfElse here.
 *
 * @author Amritansh Jaiswal
 * @version (a version number or a date)
 */
public class ConditionWithoutIfElse
{
    public static void main (String a[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your age in years: ");
        int age=scanner.nextInt();
        String message=(age>=18?"you can vote":"you cannot vote");
        System.out.println("Your age is "+age+"; hence "+message);
    }
}
