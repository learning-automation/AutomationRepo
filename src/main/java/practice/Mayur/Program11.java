package practice.Mayur;

import java.util.Scanner;
//Factorial of given number
public class Program11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the factorial number which you want");
        int num=sc.nextInt();
        int factorial=1;

        for(int i=1;i<=num;i++){
            factorial=factorial*i;
        }
        System.out.println("Factorial of given number is:"+factorial);

    }
}
