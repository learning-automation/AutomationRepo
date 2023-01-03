package practice.Prathmesh;

import java.util.Scanner;

//Fibonacci Series
public class Programme1
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number for which Fibonacci series want to be print");
        int d =sc.nextInt();
        int a=0,b=1,c=0;
        System.out.println(a);
        for (int i=0;i<d;i++)
        {
                a = b;
                b = c;
                c = a + b;
            System.out.println(c);
        }
    }
}