package practice.mohan;

import java.util.Scanner;

//palindrome
public class ProgramNo8 {
    public static void main(String[] args) {
        int remainder=0;
        int num;
        int sum=0;
        int temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any no. ");
        num=sc.nextInt();
        temp=num;
        while (num>0){
            remainder=num%10;
            sum=(sum*10)+remainder;
            num=num/10;

        }
        if (temp==sum){
            System.out.println("palindrome");
        } else
            System.out.println("not palindrome");



    }
}
