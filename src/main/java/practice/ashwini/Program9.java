/*9.even odd number */
package practice.ashwini;

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = s.nextInt();
        if (num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");

    }
}