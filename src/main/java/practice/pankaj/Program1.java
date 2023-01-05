package practice.pankaj;


import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {
        int num=0;
        Scanner var = new Scanner(System.in);
        System.out.println("Enter a Number\n");
        num = var.nextInt();


        long factorial = Factorial(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }
    public static long Factorial(int num)
    {
        if (num >= 1)
            return num * Factorial(num - 1);
        else
            return 1;
    }
}