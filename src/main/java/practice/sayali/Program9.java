package practice.sayali;

// Even Odd Number

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = sc.nextInt();
        if(num % 2 == 0)
            System.out.println("The Number is Even");
        else
            System.out.println("The Number is Odd");
    }
}
