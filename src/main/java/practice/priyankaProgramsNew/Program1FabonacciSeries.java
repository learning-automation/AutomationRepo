package practice.priyankaProgramsNew;

import java.util.Scanner;

public class Program1FabonacciSeries {
    public static void main(String[] args) {
        int a =0, b =0, c=1;

        System.out.println("Enter how many no you want in factorials :");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();

        for(int i=0;i<=no;i++) {
            a = b;
            b = c;
            c = a+b;
            System.out.print(" "+a);
        }
    }
}

