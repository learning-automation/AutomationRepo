package practice.rupali;

import java.util.Scanner;

//WAP for swapping two number without using third variable
public class Program7 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value for a: ");
        a=sc.nextInt();
        System.out.print("Enter value for b: ");
        b=sc.nextInt();
        System.out.println("Before swapping value of a and b is: "+a+"\t"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping value of a and b is: "+a+"\t"+b);

    }

}
