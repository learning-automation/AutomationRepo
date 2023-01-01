package practice.Mayur;

import java.util.Scanner;

// To Print Fibonacci series
public class Program1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number");
        int n =sc.nextInt();
        int n1=0;
        int n2=1;
        int sum=0;
        System.out.print(n1+" "+n2);
        for(int i=2;i<n;i++){
            sum=n1+n2;
            System.out.print(" "+sum);
            n1=n2;
            n2=sum;
        }
    }

}
