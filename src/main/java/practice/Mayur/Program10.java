package practice.Mayur;

import java.util.Scanner;
//To Find string is palindrome or not
public class Program10 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        String org_str=str;
        String rev="";

        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if (str.equals(rev)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }
}
