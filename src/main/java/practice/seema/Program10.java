package practice.seema;

import java.util.Scanner;

//factorial
public class Program10 {


    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        int fact=1;
        int i=1;
        while( i <= number ){
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial is :"+fact);
    }
}
