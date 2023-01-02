package practice.sayali;

// Prime Number

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = sc.nextInt();
        boolean prime = true;
        for(int i = 2; i < num; i++){
            if (num % i == 0){
                System.out.println("Number is Not Prime");
               prime = false;
               break;
            }
        }
        if (prime == true){
            System.out.println("Number is Prime");
        }

    }

}
