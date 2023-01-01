package practice.ghanshyam;

import java.util.Scanner;

public class Program9 {

    //even odd number
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Enter number");
        if(n%2==0) {
            System.out.println("Number is even");


        } else {System.out.println("Number is odd");
        }
    }
}

