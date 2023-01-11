package practice.priyankaProgramsNew;

import java.util.Scanner;

public class Program14UpperLowerChar {

    void convertUpperLowerChar() {
        System.out.println("Enter String :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        str = str.toLowerCase();

        char[] charArray = str.toCharArray();


        for (int i =0; i<charArray.length;i++) {
            if( i % 2 == 0) {
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }
        System.out.println("String is :"+new String(charArray));
    }

    public static void main(String[] args) {
        Program14UpperLowerChar p1 = new Program14UpperLowerChar();
        p1.convertUpperLowerChar();
    }

}

