package practice.pankaj;
import java.util.*;

public class ReverseString {

    public static void main(String args[])
    {
        String original, reverse = "";
        Scanner var = new Scanner(System.in);
        System.out.println("Enter a string\n");
        original = var.nextLine();
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);

        System.out.println("Reverse of string\n"+reverse);
    }


}
