package PriyankaPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Program2SortString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String str1 = sc.next();

        char[] arr = str1.toCharArray();
        Arrays.sort(arr);

        System.out.println("Sorted String : "+Arrays.toString(arr));

    }
}
