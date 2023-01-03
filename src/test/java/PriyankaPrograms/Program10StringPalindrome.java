package PriyankaPrograms;

import java.util.Scanner;

public class Program10StringPalindrome {
    public static void main(String[] args){
        String str1, reverseStr="";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        str1 = sc.next();

        char[] token = str1.toCharArray();
        for(int i = token.length-1; i>=0; i--) {
            reverseStr = reverseStr + str1.charAt(i);
        }
        if(str1.toLowerCase().equals(reverseStr.toLowerCase()))
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome.");
    }
}
