package practice.sayali;

// Factorial

import java.util.Scanner;

public class Program11 {
    // Using For loop
    public void factorial(){
        System.out.println("***** Factorial Using For Loop ******");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to calculate the Factorial : ");
        int number = sc.nextInt();
        int fact = 1;
        for(int i = 1; i <= number; i++){
            fact = fact * i;

        }
        System.out.println("The Factorial of " +number +" is : "+fact);
    }

    // Using Recursion Function
    int fact = 1;
    public int recursionFactorial(int number){
        fact = fact * number;
        number = number-1;
        if(number > 1 )
            recursionFactorial(number);
            return fact;
    }


    public static void main(String[] args) {
        Program11 p11 = new Program11();
        p11.factorial();
        int f = p11.recursionFactorial(5);
        System.out.println("\n ***** Factorial Using Recursion ******");
        System.out.println("The Factorial is : "+f);
    }
}
