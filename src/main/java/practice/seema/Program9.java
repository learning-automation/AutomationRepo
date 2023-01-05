package practice.seema;

import java.util.Scanner;

//polindrome number
public class Program9 {
    public static void main(String args[]) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int reverse= 0;
        int remainder;

        int original = num;

        while(num !=0) {
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }
        if( original == reverse){
            System.out.println(original  + " is Palindrome");
        }
        else {
            System.out.println(original  + " is not Palindrome");
        }

    }
}



