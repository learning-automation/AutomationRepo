package practice.mohan;

import java.util.Scanner;

//string palindrome
public class ProgramNo10 {
    public static void main(String[] args) {
        String s;
        String temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Value");
        s=sc.next();
        temp=s;
        String reverse="";
        int length=s.length();
        for (int i = length-1; i>=0 ; i--) {
            reverse=reverse+s.charAt(i);


        }
        if (temp.equals(reverse)){
            System.out.println(temp+" is palindrome : ");
        }
        else
            System.out.println(temp+" is not palindrome : ");

    }
}
