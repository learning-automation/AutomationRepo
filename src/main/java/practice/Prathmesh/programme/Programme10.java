package practice.Prathmesh.programme;

import org.testng.annotations.Test;

import java.util.Scanner;

//Palindrome String
public class Programme10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word ");
        String name = sc.nextLine();
        String reverse="";
        System.out.println("\nOriginal String is: \n"+ name);
        String name1[] = name.split("");
        System.out.println("Reverse String is: \t ");
        for (int i=name.length()-1;i>=0;i--)
        {
            reverse=reverse+name1[i];
        }
        System.out.println(reverse);
        if (name.equalsIgnoreCase(reverse))
            System.out.println("The string is Palindrome");
        else
            System.out.println("the String is not Palindrome");
    }
}
