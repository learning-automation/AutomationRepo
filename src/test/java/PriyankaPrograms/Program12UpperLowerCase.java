package PriyankaPrograms;

import java.util.Arrays;

public class Program12UpperLowerCase {

    public static void main(String[] args) {
        String str1 = "Hi this is priyanka thorat";
        str1.toLowerCase();
        
        String[] token = str1.split("");

        for (int i = 0;i <= token.length-1; i+=2) {
            if( i%2 == 0) {
                System.out.print(""+token[i].toUpperCase());

            }
            else {
                System.out.print(""+token[i].toLowerCase());
            }
        }

    }
}
