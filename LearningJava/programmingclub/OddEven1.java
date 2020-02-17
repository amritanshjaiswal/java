package programmingclub;

public class OddEven1
{
    public static void main(String args[])
    {
        int e=0;
        int o=0;
        for(int i=1;i<=100;i++)
        {
            if(i%2==0)
            e=e+i;
            else
            o=o+i;
        }
        System.out.println("Sum of even numbers= "+e);
        System.out.println("Sum of odd numbers= "+o);
    }
}