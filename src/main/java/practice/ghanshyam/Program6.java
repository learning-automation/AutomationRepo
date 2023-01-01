package practice.ghanshyam;

import java.util.Scanner;

public class Program6 {

    //prime number
    public static void main(String[] args){

        int n ,count =0;
        Scanner sc = new Scanner(System.in); //prime 2 factor o & div 1 nd slf
        n = sc.nextInt();
        System.out.print("Enter any number ");

        for(int i=1; i<=n; i++){
            if(n%i==0)
                count++;

        }
        if(count==2)
            System.out.print("prime number");
        else
            System.out.print("not a prime number");
    }
}



