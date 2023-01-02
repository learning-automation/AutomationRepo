package practice.sayyed;

import java.util.Scanner;

public class P11_PalindromeString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.next();
        String org_String = str;
        String rev = "";
        int length = str.length();
        for (int i = length - 1; i >= 0; i--) {

            rev = rev + str.charAt(i);

        }
        if (org_String.equals(rev)) {

            System.out.println(org_String + "is palindrome String");
        } else {

            System.out.println(org_String + "is not palindrome String");


        }


    }
}
