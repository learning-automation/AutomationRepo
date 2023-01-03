package practice.Sachin;

import java.util.Scanner;

public class Program6_PrimeNumber {

    // Prime Number
    public static void main(String[] args){
        int count=0;
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sr.nextInt();

        for (int i=1; i<=n; i++){
            if (n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("it is a prime number");
        }else{
            System.out.println("it is not a prime number");
        }
    }
}
