package programmingclub;

import java.util.*;
public class Rainbow
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any alphabet from 'VIBGYOR'");
        char ch=sc.next().charAt(0);
        switch(ch)
        {
            case'v':
            case'V':System.out.println("Violet");
                    break;
            case'i':
            case'I':System.out.println("Indigo");
                    break;
            case'b':
            case'B':System.out.println("Blue");
                    break;
            case'g':
            case'G':System.out.println("Green");
                    break;
            case'y':
            case'Y':System.out.println("Yellow");
                    break;
            case'o':
            case'O':System.out.println("Orange");
                    break;
            case'r':
            case'R':System.out.println("Red");
                    break;
                }
            }
        }
        