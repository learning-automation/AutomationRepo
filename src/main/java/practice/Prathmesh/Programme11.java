package practice.Prathmesh;

import org.testng.annotations.Test;
//Factorial
import java.util.Scanner;

public class Programme11 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check prime or not ");
        int a = sc.nextInt();
        int b=1;
        for (int i=a;i>1;i--)
        {
           a=a*(i-1);
        }
       System.out.println(a);
    }
}

