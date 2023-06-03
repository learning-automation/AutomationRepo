package practice.Prathmesh.programme;

import java.util.Scanner;

//Odd Even number
public class Programme9 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number ");
        int a = sc.nextInt();
        if (a%2==0)
            System.out.println("Given number is even number ");
        else
            System.out.println("Given number is odd");
    }
}