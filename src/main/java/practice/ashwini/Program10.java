/*10.String palindrom ( yoy, madam )*/

package practice.ashwini;

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args)
    {
        String original,reverse="";
        int length;
        Scanner in =new Scanner(System.in);
        System.out.println("Enter string:");
        original=in.nextLine();
        length=original.length();
        for(int i=length-1;i>=0;i--)
        {
             reverse=reverse+original.charAt(i);
        }
        System.out.println(reverse);

        if(original.equals(reverse))
            System.out.println("String is palindrome");
        else
                System.out.println("String is not palindrome");

 }


}
