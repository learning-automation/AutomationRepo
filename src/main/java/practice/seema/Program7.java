package practice.seema;

import java.util.Scanner;

//polindrome String
public class Program7 {
    public static void main(String args[]){
        System.out.println("Enter the string");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int strLength=str.length();
        int i=0,j=strLength-1;
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j)){
                System.out.println("not polindrom");
                System.exit(0);
            }
            i++;
            j--;
        }
        System.out.println("Polindrome");
    }
}
