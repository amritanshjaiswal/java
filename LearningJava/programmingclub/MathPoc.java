package programmingclub;

import java.util.*;
import java.io.*;
public class MathPoc
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        double n=sc.nextDouble();
        System.out.println("Ceil of the number is ="+Math.ceil(n));
        System.out.println("Floor of the number is ="+Math.floor(n));
        System.out.println("Square root of the number is ="+Math.sqrt(n));
        System.out.println("Cube root of the number is ="+Math.cbrt(n));
    }
}
