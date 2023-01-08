package practice.Sachin;

import java.util.Scanner;

public class Program11_FactorialCalculation {

    // Factorial Calculation using for loop
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("check factorial");
        int a = sc.nextInt();
        int b=1;
        for (int i=a; i>1; i--)
        {
            a = a*(i-1);
        }
        System.out.println(a);
    }

}
