package practice.Sachin;

import java.util.Scanner;

public class Program5_ReverseString {

    // Reverse String
    public static void main(String[] args){
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sr.nextLine();

        String reverseStr = "";
        int length = str.length();

        for (int i=length-1; i>=0; i--){
            reverseStr = reverseStr+ str.charAt(i);
        }
        System.out.println("The reverse String is : " +reverseStr);
    }
}
