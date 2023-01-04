package practice.Renuka;

import java.util.Scanner;

//palindrom number
public class Program8 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number");
        int num = sc.nextInt();
        int rev=0;
        int org_num = num;

        while (num!=0){
            rev=rev*10+num%10;
            num = num/10;
        }
        if(org_num==rev){
            System.out.println("Number is Palindrom Number");
        }
        else
        {
           System.out.println("Number is not Palindrom Number");
        }

    }
}
