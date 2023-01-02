package practice.sayali;

// Convert the character in uppercase and lowercase alternatively

import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String");
        String str = sc.nextLine();
        str = str.toLowerCase();
        char[] ch = str.toCharArray();
        for(int i = 1; i < ch.length; i = i+2){
            ch[i] = Character.toUpperCase(ch[i]);
        }

        System.out.println("Result String is : "+new String(ch));
    }
}
