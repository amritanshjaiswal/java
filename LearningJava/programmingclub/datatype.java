package programmingclub;

import java.util.*;
public class datatype
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number ");
        if(sc.hasNextInt())
        {
            int a=sc.nextInt();
            System.out.println("It is an integer "+a);
        }
        else if(sc.hasNextDouble())
        {
            double a=sc.nextDouble();
            System.out.println("It is a double "+a);
        }
        else if(sc.hasNextFloat())
        {
            float a=sc.nextFloat();
            System.out.println("It is a float "+a);
        }
        else
        {
        System.out.println("Wrong input");
    }
}
}

    