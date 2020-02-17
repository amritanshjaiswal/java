package programmingclub;

import java.util.*;
public class SumProduct
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two double values");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double s=a+b;
        double p=a*b;
        System.out.println("Sum of the two values="+s);
        System.out.println("Product of the two values ="+p);
    }
}