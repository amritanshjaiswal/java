package programmingclub;

import java.util.*;
public class PositiveNegative
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        if(n>0)
        {
            System.out.println("It is a positive number ");
        }
        else if(n<0)
        {
            System.out.println("It is a negative number ");
        }
        else
        {
            System.out.println("The number entered is zero ");
        }
    }
}