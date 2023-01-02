package practice.sayali;

// Find the count of each alphabet

import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String");
        String str = sc.nextLine();
        String s = str.toLowerCase();

        for (char ch = 'a'; ch <= 'z'; ch++){
            int count = 0;
            for (int i = 0; i<s.length(); i++){
                if(ch == s.charAt(i))
                    count++;
            }
            if (count != 0)
                System.out.println(ch + "\t" +count);
        }

    }
}
