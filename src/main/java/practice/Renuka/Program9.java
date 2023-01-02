package practice.Renuka;

import java.util.Scanner;

//even odd number
public class Program9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("This is Even Number");
        }
        else
        {
            System.out.println("This is odd Number");
        }
    }
}
