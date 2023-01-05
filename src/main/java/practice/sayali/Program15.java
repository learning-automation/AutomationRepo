package practice.sayali;
import java.util.Scanner;

// Convert the word in uppercase and lowercase alternatively

public class Program15 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your String");
            String str = sc.nextLine();
            String[] letter = str.split(" ");
            for (int i = 0; i < letter.length; i++){
                if(i % 2 == 0) {
                    String s = letter[i].toLowerCase();
                    System.out.print(s);
                }
                else {
                    String s = letter[i].toUpperCase();
                    System.out.print(s);
                }
                System.out.print(" ");
            }
        }
    }


