package practice.ghanshyam;

import java.util.Arrays;
import java.util.Collections;

public class Program5 {

    //reverse string

    public static void main(String[] args) {

        /* StringBuffer str = new StringBuffer("my name is ghanshyam");
         System.out.println(str.reverse());*/




         String s = "lets do coding";
         String s2 = "";
         int l = s.length();

         for(int i=l-1; i>=0; i--){
             s2 = s2 + s.charAt(i);
         }
         System.out.println(s2);


    }
}