package practice.Mayur;

import java.util.Scanner;

public class Program15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        String[] split = str.split(" ");
        for (int i = 0; i < split.length; i++) {
            if (i % 2 == 0) {
                System.out.print(" "+split[i].toLowerCase());
            } else {
                System.out.print(" "+split[i].toUpperCase());
            }
        }




    }
}
