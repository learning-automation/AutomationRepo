package practice.rupali;

import java.util.Scanner;

//WAP for palindrome String
public class Program9
{
    public static void main(String[] args) {
        String original,reverse="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        original=sc.nextLine();
        int length=original.length();
        for (int i=length-1;i>=0;i--)
        {
            reverse=reverse+original.charAt(i);
        }
        System.out.println("Reverse String is: "+reverse);
        if(original.equals(reverse))
            System.out.println("String is Palindrome");
        else
            System.out.println("String is not palindrome");
    }
}
