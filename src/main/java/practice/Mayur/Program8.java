package practice.Mayur;

import java.util.Scanner;
//To Check given number is palindrome or not
public class Program8 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int org_no=num;
        int rev=0;
        while (num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        if(org_no == rev){
            System.out.println(org_no+ "this number is palindrome number");
        }else{
            System.out.println(org_no+ "this number is not palindrome number");
        }
    }
}
