/*8.palindrom number*/
package practice.ashwini;

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int reminder,sum=0,temp;
        int number;
        System.out.println("Enter the number: ");
        number=s.nextInt();
        temp=number;
        while(number>0)
        {
            reminder=number%10;  //getting remainder
            sum=(sum*10)+reminder;
            number=number/10;
       }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }
}


