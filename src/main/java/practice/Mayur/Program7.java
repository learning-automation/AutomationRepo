package practice.Mayur;

import java.util.Scanner;

//Swapping of number
public class Program7 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("Value before swapping is:"+x+" "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("value after swapping is:"+x+" "+y);
    }
}
