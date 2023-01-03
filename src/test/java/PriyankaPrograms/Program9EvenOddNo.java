package PriyankaPrograms;

import java.util.Scanner;

public class Program9EvenOddNo {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No:");
        int a = sc.nextInt();

        if((a % 2) == 0)
            System.out.println("No is Even.");
        else
            System.out.println("No is Odd");
    }
}
