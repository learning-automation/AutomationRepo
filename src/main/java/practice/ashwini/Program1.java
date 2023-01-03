/* 1.fabonacci series */
package practice.ashwini;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        int num,a=0,b=0,c=1;
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number of times do you want to print fibonacci series:");
        num=in.nextInt();
        System.out.println("The Fibonacci series is:");
        for(int i=0;i<num;i++)
        {
            a=b;
            b=c;
            c=a+b;
            System.out.println(a + " ");
        }
    }



}
