package programmingclub;

import java.util.*;
public class Discount
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the purchase amount ");
        int a=sc.nextInt();
        double d=0.0;
        if(a>=3000&&a<5001)
        {
         d=4;
    }
        else if(a>=5001&&a<10001)
        {
             d=7.5;
        }
        else if(a>=10001&&a<20001)
        {
             d=9;
        }
        else if(a>=20001)
        {
             d=12;
        }
         d=(a*d)/100;
        double x=a-d;
        System.out.println("Discount= "+d);
        System.out.println("Final amount= "+x);
    }
}
        
        
  