package programmingclub;

import java.util.*;
public class Area3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 for area of circle ");
        System.out.println("Press 2 for area of square ");
        System.out.println("Press 3 for area of rectangle ");
        System.out.println("Press 4 to exit ");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:System.out.println("Enter the radius of the circle ");
                    double r=sc.nextInt();
                    double a=3.14*r*r;
                    System.out.println("Area of the circle is = "+a);
                    break;
            case 2:System.out.println("Enter the side if the square ");
                    double s=sc.nextInt();
                    double a1=s*s;
                    System.out.println("Area of the square = "+a1);
                    break;
            case 3:System.out.println("Enter the lenght and breadth of the rectangle");
                    double l=sc.nextDouble();
                    double b=sc.nextDouble();
                    double a2=l*b;
                    System.out.println("Area of the rectangle = "+a2);
                    break;
            case 4:System.exit(0);
                    break;
            default:System.out.println("Wrong input!!!");
        }
    }
}
                    
                    
                    