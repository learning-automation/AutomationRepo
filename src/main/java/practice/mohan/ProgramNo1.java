package practice.mohan;

import java.util.Scanner;
//fibonacci
public class ProgramNo1 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter any no");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.println("Fibonacci series till n times that is "+n);
        for (int i = 1; i <=n ; i++) {
            System.out.print(a+",");// zero will be printed as it is.
            int c=a+b;

            a=b;
            //System.out.print("a");
            b=c;

        }

    }
}
