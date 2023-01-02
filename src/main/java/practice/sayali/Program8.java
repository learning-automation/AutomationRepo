package practice.sayali;

// Palindrome Number

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        int r = 0;
        int total = 0;
        int temp = num;
        while (num > 0){
           r = num % 10;
           total = (total * 10) + r;
            num = num / 10 ;
        }
        if (temp == total)
            System.out.println("The Given Number is Palindrome");
        else System.out.println("The Given Number is Not Palindrome");
    }
}
