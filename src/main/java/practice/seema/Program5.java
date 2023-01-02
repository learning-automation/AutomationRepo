package practice.seema;

import java.util.Scanner;

//Prime number
public class Program5 {
    public static void main(String args[]){
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        number=sc.nextInt();
      /*  if(number%2==0)
            System.out.println("Given number is prime");
        else
        System.out.println("given number is not a prime number");*/
        boolean prime=true;
        for(int i=2;i<number;i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }

        }
            System.out.println(prime);

    }
}
