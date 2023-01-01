package practice.Mayur;

import java.util.Scanner;
//To find number is Prime or not
public class Program6 {
    public static void main (String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int count=0;

        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("the given number is prime");
        }else{
            System.out.println("the number is not prime");
        }

    }
}
