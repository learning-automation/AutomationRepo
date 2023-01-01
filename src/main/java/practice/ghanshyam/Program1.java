package practice.ghanshyam;

import java.util.Scanner;

public class Program1 {

    //fibonacci series

    public static void main(String[] args){

        int k , a= 1 ,b=1 ;
        k=0;
        Scanner sc = new Scanner(System.in); // scanner to take value from user
        int n = sc.nextInt();
        System.out.println("Enter number");
        System.out.print("1 1 ");
        while(k<=n){
            k=a+b;
            if(k>=n)
                break;
            System.out.print(k + " ");
            a=b;
            b=k;
        }


    }

}
