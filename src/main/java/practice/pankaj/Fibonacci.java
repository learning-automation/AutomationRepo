package Pankaj;
import org.testng.annotations.Test;

import java.util.Scanner;


public class Fibonacci
{
    @Test
    public void fibonaccee()
    {
        int n,a=0,b=0,c=1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of n:");
        n = s.nextInt();
        System.out.print("Fibonacci Series:");
        for(int i = 1; i <= n; i++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a+" ");
        }
    }
}
