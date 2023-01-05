package practice.rupali;

import java.util.Scanner;
//WAP to find fibonacci series
public class Program5 {
    public static void main(String[] args)
    {
        int a=0,b=0,c=1,num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number for series: ");
        num=sc.nextInt();
        System.out.println("Fibonacci Series for number is: ");
        for(int i=0;i<num;i++)
        {
            a=b;
            b=c;
            c=a+b;
            System.out.println(""+a);
        }
    }
}
