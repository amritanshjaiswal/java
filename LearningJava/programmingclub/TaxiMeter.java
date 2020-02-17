package programmingclub;

import java.util.*;
public class TaxiMeter
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance travelled ");
        int d=sc.nextInt();
        double b=0;
        if(d>0&&d<=10)
        b=d*9;
        else if(d>10&&d<=25)
        b=90+((d-10)*7);
        else if(d>25&&d<=50)
        b=195+((d-25)*5.5);
        else if(d>50)
        b=332.5+((d-50)*5);
        System.out.println("Your  bill is = "+b);
    }
}

        