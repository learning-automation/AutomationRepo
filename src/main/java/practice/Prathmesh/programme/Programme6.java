package practice.Prathmesh.programme;

import org.testng.annotations.Test;

import java.util.Scanner;

//find Number is Prime or not
public class Programme6
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number to check prime or not ");
        int a =sc.nextInt();
        int count=0;
        if (a<2)
            System.out.println("Number is not prime");
        else
        {
            for (int i=1;i<=a;i++)
            {
                if (a%i==0)
                    count++;
            }
            if (count>2)
                System.out.println("The number is not prime ");
            else
                System.out.println("The Number is prime ");
        }
    }
}
