package practice.Sachin;

import java.util.Scanner;

public class Program11_FactorialUsingRecursion {
    // Recursion =  call the method again again
    static int factorial(int n){
        if (n==1){
            return 1;
        }else{
            return (n * factorial(n-1));
        }
    }

    public static void main(String[] args){
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int number = sr.nextInt();
        int fact;
        fact = factorial(number);
        System.out.println("Factorial of : " + number + " is " + fact);
    }
}
