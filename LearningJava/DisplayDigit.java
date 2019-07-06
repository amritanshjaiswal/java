import java.util.*;
/**
 * Write a description of class DisplayDigit here.
 *
 * @author Amritansh Jaiswal
 * @version (a version number or a date)
 */
public class DisplayDigit
{
    public static void main(String args[]){
        int threeDigitNumber=123;
        System.out.println("Three digit number is: "+threeDigitNumber);
        String threeDigNumStr= ""+threeDigitNumber;
        char[] charArray=threeDigNumStr.toCharArray();
        
        for(int i=0;i<charArray.length;){

            System.out.print(charArray[i]);
            i++;
            if(i<charArray.length){
                System.out.print(",");
            }
            else{
                System.out.print(".");
            }
        }
        
        
    }
}
