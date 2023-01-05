package practice.seema;

import java.util.Scanner;

//Reverse String
public class Program4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        int length=str.length();
        System.out.println("Revers string is");
        for(int i=length-1;i>=0;i--){
            System.out.print(str.charAt(i));

        }
    }
}
