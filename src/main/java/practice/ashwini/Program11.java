/*11.factorial calculation - Reccusrsion and for loop */
package practice.ashwini;

import java.util.Scanner;

public class Program11 {
    public static void main(String[] args)
    {
        int i,fact=1,number;

        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number to calculate factorial:");
        number=in.nextInt();

        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }


}

