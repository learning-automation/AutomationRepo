package practice.seema;

import java.util.Scanner;

//factorial
public class Program10 {
    public static int fact(int number){
        if(number==0)
            return 1;
        else
            return  number*fact(number-1);
    }

    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        System.out.println("Factorial is :"+fact(number));
    }
}
