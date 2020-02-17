package programmingclub;

import java.util.*;
public class DASA
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your basic");
        int b=sc.nextInt();
        double da=0.0;
        double sa=0.0;
        double s=0.0;
        if(b<10001)
        {
            da=10;
            sa=5;
        }
        else if(b>=10001&&b<20001)
        {
            da=12;
            sa=8;
        }
        else if(b>=20001&&b<30001)
        {
            da=15;
            sa=10;
        }
        else if(b>=30001)
        {
            da=20;
            sa=12;
        }
        da=(b*da)/100;
        sa=(b*sa)/100;
        s=b+da+sa;
        System.out.println("DA= "+da);
        System.out.println("SA= "+sa);
        System.out.println("Total salary= "+s);
    }
}