package practice.Sachin;

import java.util.Scanner;

public class Program8_PalindromeNumber {
    // Palindrome
    public static void main(String[] args){
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n=sr.nextInt();

        int a;
        int sum =0;
        int b;

        b=n;
        while(n>0){
            a=n%10;
            sum = (sum*10)+a;
            n=n/10;
        }
        if (b==sum){
            System.out.println("this number is palindrome");
        }else{
            System.out.println("this number is not palindrome");
        }
    }
}
