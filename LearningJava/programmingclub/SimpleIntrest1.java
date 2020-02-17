package programmingclub;

import java.util.*;
public class SimpleIntrest1
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal,rate of intrest and time ");
        double p=sc.nextDouble();
        double r=sc.nextDouble();
        double t=sc.nextDouble();
        double s=(p*r*t)/100;
        System.out.println("Simple intrest is ="+s);
    }
}
        
        