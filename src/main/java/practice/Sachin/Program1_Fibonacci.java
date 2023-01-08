package practice.Sachin;

import java.util.Scanner;

public class Program1_Fibonacci {

    // Fibonacci Series
    public static void main(String[] args){
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter the Nummber : ");
        int n= sr.nextInt();

        int a=0;
        int b=1;
        int c;

        for (int i=1; i<=n; i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println("print the fibonacci series : "+a);
        }
    }
}
