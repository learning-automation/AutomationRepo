package practice.sayali;

// Convert the character in uppercase and lowercase alternatively

import java.util.Scanner;

public class Program14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String");
        String str = sc.nextLine();
        String[] letter = str.split(" ");
        for(String s : letter){
            char[] s1 = s.toCharArray();
            for(int i = 0; i < s1.length; i++){
                if(i % 2 == 0 && s1[i]!= ' ')
                    s1[i] = Character.toUpperCase(s1[i]);
                else
                    s1[i] = Character.toLowerCase(s1[i]);
                System.out.print(s1[i]);
            }
            System.out.print(" ");

        }
    }
}
