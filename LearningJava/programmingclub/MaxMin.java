package programmingclub;

import java.util.*;
public class MaxMin
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b&&a>c)
        {
            System.out.println("Greatest no. is "+a);
        }
        else if(b>a&&b>c)
        {
            System.out.println("Greatest no. is "+b);
        }
        else if(c>a&&c>b)
        {
            System.out.println("Greatest no. is "+c);
        }
        if(a<b&&a<c)
        {
            System.out.println("Smallest no. is "+a);
        }
        else if(b<a&&b<c)
        {
            System.out.println("Smallest no. is "+b);
        }
        else
        {
            System.out.println("Smallest no. is "+c);
        }
    }
}
