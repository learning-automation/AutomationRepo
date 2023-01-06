package practice.mohan;

import java.util.Scanner;
//Prime
public class ProgramNo6 {
    public static void main(String[] args) {
        int n;
        int counter = 0;//to count no. of times it got divisible.
        System.out.println("Enter any no.");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) { //strtng loop from 1 beacuse
            if (n % i == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            System.out.println("prime");
        } else
            System.out.println("not prime");
    }
}
