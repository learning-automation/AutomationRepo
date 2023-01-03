package practice.mohan;

import java.util.Scanner;

//even odd
public class ProgramNo9 {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter the no");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if (a%2==0){
            System.out.println("no. is even");
        }else {
            System.out.println("no is odd");
        }


    }
}
