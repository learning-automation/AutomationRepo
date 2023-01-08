package practice.sayali;

// String Palindrome

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();
        char[] ch = str.toCharArray();
        String revstr = "";
        for(int i = ch.length-1 ; i >= 0; i--){
            revstr = revstr + str.charAt(i);
        }
        if (str.toLowerCase().equals(revstr.toLowerCase()))
            System.out.println("String is Palindrome");
        else
            System.out.println("String is not Palindrome");
    }
}
