package practice.sayyed;

import java.util.Scanner;

public class P09_PalindromeNumber {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        int org_n=n;
        int rev_n=0;
        while(n!=0){
            rev_n=rev_n*10+n%10;
            n=n /10;
        }
        if(org_n==rev_n){

            System.out.println( org_n  + ": This is Palindrome Number");

        }
        else {
            System.out.println(org_n + ": This is not Palindrome Number");
        }
    }



}
