package practice.rupali;

import java.util.Scanner;

//WAP for even odd number
public class Program6 {
    public static void main(String[] args)
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        num=sc.nextInt();
        if(num%2==0)
            System.out.println("Given Number is Even");
        else
            System.out.println("Given Number is odd");

    }

}
