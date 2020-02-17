package programmingclub;

import java.util.*;
public class Mathematics
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Press 1 for addition ");
        System.out.println("Press 2 for subtraction ");
        System.out.println("Press 3 for multiplication ");
        System.out.println("Press 4 for division  ");
        System.out.println("Press 5 to exit  ");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:System.out.println("Sum of the two nuumbers is "+(a+b));
                    break;
            case 2:System.out.println("Difference of the two numbers is "+(a-b));
                    break;
            case 3:System.out.println("Prooduct of the two nuumbers is "+(a*b));
                    break;
            case 4:System.out.println("Quotient of the two nuumbers is "+(a/b));        
                    break;
            case 5:System.exit(0);
                    break;
            default:System.out.println("Wrong input!!!");
                    break;
                }
            }
        }
        