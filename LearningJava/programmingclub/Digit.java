package programmingclub;

import java.util.*;
public class Digit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a single,double or a triple digit no.");
        int n=sc.nextInt();
        if(n>=0&&n<10)
        {
            System.out.println("It is a single digit no. "+n);
        }
        else if(n>=10&&n<100)
        {
            System.out.println("It is a double diit no. "+n);
        }
        else if(n>=100&&n<1000)
        {
            System.out.println("It is a triple digit no. "+n);
        }
        else
        {
            System.out.println("Wrong input ");
        }
    }
}