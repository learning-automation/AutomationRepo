package practice.Mayur;

import java.util.Scanner;
//reverse of a string
public class Program5 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String of your choice");
        String str=sc.nextLine();
        String rev="";

        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println("Reverse of the string is:"+rev);
    }
}
