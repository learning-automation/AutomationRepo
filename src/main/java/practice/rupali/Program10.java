package practice.rupali;

import java.util.Scanner;

//WAP for Factorial using for loop
public class Program10
{
    public static void main(String[] args)
    {
        int fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number=sc.nextInt();
        for(int i=1;i<=number;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial is: "+fact);

    }
}

