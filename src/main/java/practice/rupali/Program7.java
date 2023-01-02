package practice.rupali;

import java.util.Scanner;

//WAP for swapping two number with using third variable
public class Program7 {
    public static void main(String[] args) {
        int a,b,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for a: ");
        a=sc.nextInt();
        System.out.println("Enter value for b: ");
        b=sc.nextInt();
        System.out.println("Before swapping value of a and b is: "+a+"\t"+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping value of a and b is: "+a+"\t"+b);

    }

}
