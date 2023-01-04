package practice.Fahim;

import java.util.Scanner;

public class P07_FindThePrimeNumber {


        static  boolean isPrime(int num) {
        if(num<=1)                      // Condition 1 - The number should be greater than or equal to 1
        {
            return false;
        }

        for(int i=2; i<=num/2; i++) {

            if(num % i == 0) {       // Condition 2 - The number should not be divisible to any number except 1 and itself.
                return false;
            }

        }
        return true;


    }

    public static void main (String args[]){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to check if it is truly prime number or not: ");
        int number= sc.nextInt();

        if(isPrime (number)) {
            System.out.println(number + " is prime number");
        }
        else{
            System.out.println(number + " is a non-prime number");

        }
    }



}
