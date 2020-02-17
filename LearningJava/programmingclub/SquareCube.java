package programmingclub;

import java.util.*;
public class SquareCube
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a long value");
        long n=sc.nextLong();
        long s=n*n;
        long c=n*n*n;
        System.out.println("Square of the value is"+s);
        System.out.println("Cube of the value is"+c);
    }
}